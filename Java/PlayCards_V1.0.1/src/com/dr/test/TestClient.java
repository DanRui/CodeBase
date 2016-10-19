package com.dr.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by danjack on 16/10/6.
 */
public class TestClient {

    public static void main (String[] args) {
        Socket s = null;
        OutputStream out = null;
        try {
            s = new Socket();
            s.connect(new InetSocketAddress("127.0.0.1", 8080));
            out = s.getOutputStream();
            out.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                if (!s.isClosed()) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
