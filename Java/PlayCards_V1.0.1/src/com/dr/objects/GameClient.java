package com.dr.objects;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by danjack on 16/10/6.
 */
public class GameClient extends Thread {

    private Socket socket = null;

    private Player player;

    public GameClient() {
        this.socket = new Socket();
        this.player = new Player(false, null);
    }

    @Override
    public void run() {
        ObjectOutputStream out = null;
        try {
            socket.connect(new InetSocketAddress("127.0.0.1", 8080));
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(this.player);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                if (!socket.isClosed()) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main (String[] args) {
        new GameClient().start();
    }

}
