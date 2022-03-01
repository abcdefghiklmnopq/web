/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import model.JsonReader;

/**
 *
 * @author thand
 */
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket ServerSocket = new ServerSocket(3333);
        Socket Socket =ServerSocket.accept();
        System.out.println("ServerSocket start");
        DataInputStream DataInputStream = new DataInputStream(Socket.getInputStream());
        DataOutputStream DataOutputStream = new DataOutputStream(Socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        int i=0;
        String str = JsonReader.getlist();
        System.out.println(str);
        while (true) {
            System.out.println("Start:");
            str = JsonReader.getlist();
            DataOutputStream.writeBytes(str);
            DataOutputStream.flush();
            String x = sc.nextLine();
            System.out.println("X:");
            if(x.equals("q")){
                break;
            }
        }
        DataOutputStream.close();
        DataInputStream.close();
        Socket.close();
        ServerSocket.close();

    }
}
