package com.frackstudios.application;

/**
 * Created by ToxicA0E on 5/30/2016.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

    private Socket client;
    private DataInputStream fromClient;
    private DataOutputStream toClient;

    public ClientSocket(Socket socket) throws IOException {
        client = socket;
        fromClient = new DataInputStream(socket.getInputStream());
        toClient = new DataOutputStream(socket.getOutputStream());

        client.setSoTimeout(50);
    }

    public String receieve() throws IOException {
        return fromClient.readUTF();
    }

    public void send(String str) throws IOException {
        toClient.writeUTF(str);
    }

}
