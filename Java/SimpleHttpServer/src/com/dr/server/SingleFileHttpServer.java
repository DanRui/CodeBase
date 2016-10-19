package com.dr.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by danjack on 16/10/6.
 */
public class SingleFileHttpServer {

    private final byte[] content;

    private final byte[] header;

    private final int port;

    private final String encoding;

    public SingleFileHttpServer(String data, String encoding, String mimeType, int port) throws UnsupportedEncodingException {
        this(data.getBytes(encoding), encoding, mimeType, port);
    }

    public SingleFileHttpServer(byte[] data, String encoding, String mimeType, int port) {
        this.content = data;
        this.port = port;
        this.encoding = encoding;
        String header = "HTTP/1.0 200 OK\r\n"
                + "Server: OneFile 2.0\r\n"
                + "Content-length:" + this.content.length + "\r\n"
                + "Content-type:" + mimeType + "; charset=" + encoding + "\r\n\r\n";
        this.header = header.getBytes(Charset.forName("US-ASCII"));
    }

    public void start() {
        ExecutorService pool = Executors.newFixedThreadPool(100); //创建一个线程池
        try {
            ServerSocket server = new ServerSocket(this.port);

            while (true) {
                Socket connection = server.accept();
                pool.submit(new HTTPHandler(connection));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private class HTTPHandler implements Callable<Void> {
        private final Socket connection;

        HTTPHandler(Socket connection) {
            this.connection = connection;
        }


        @Override
        public Void call() throws IOException {
            try {
                OutputStream out = new BufferedOutputStream(connection.getOutputStream());
                InputStream in = new BufferedInputStream(connection.getInputStream());
                StringBuilder request = new StringBuilder(80);
                while (true) {
                    int c = in.read();
                    if (c == '\r' || c == '\n' || c == -1) {
                        break;
                    }
                    request.append((char) c);
                }
                if (request.toString().indexOf("HTTP/") != -1) {
                    out.write(header);
                }
                out.write(content);
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                connection.close();
            }
            return null;
        }
    }

    public static void main (String[] args) {
        int port;
        try {
            port = Integer.parseInt(args[1]);
            if (port < 1 || port > 65535) {
                port = 8080;
            }
        } catch (RuntimeException e) {
            port = 8080;
        }
        String encoding = "UTF-8";
        if (args.length > 2) {
            encoding = args[2];
        }
        try {
            Path path = Paths.get(args[0]);
            byte[] data = Files.readAllBytes(path);

            String contentType = URLConnection.getFileNameMap().getContentTypeFor(args[0]);
            SingleFileHttpServer server = new SingleFileHttpServer(data, encoding, contentType, port);
            server.start();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
