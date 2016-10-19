package com.dr.test;

import com.dr.objects.Player;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by danjack on 16/10/6.
 */
public class TestServer {
    public static void main (String[] args) {
        ServerSocket ss = null;
        Socket socket = null;
        ObjectInputStream in = null;
        try {
            ss = new ServerSocket(8080);
            while (true) {
                socket = ss.accept();
                in = new ObjectInputStream(socket.getInputStream());
                Player player = (Player) in.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                if (!socket.isClosed()) {
                    socket.close();
                }
                if (!ss.isClosed()) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
