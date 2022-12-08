package com.tg;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true) {
//                Socket socket =serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();
                new Echoer(serverSocket.accept()).start(); // this line replaces the top three commented lines
            }

        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}