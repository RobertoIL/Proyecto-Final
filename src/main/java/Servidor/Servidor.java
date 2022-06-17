package Servidor;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try {
            int i=0;
            ServerSocket ss = new ServerSocket(3000);
            System.out.println("Listening...");
            Socket s = ss.accept();
            System.out.println("Connection accepted");
            InputStream d1 = s.getInputStream();


            while ((char)i !='q')
            {
                i = d1.read();
                System.out.print((char)i);

            }
            s.close();
            ss.close();
        } catch (Exception e) {System.out.println("Error"); }

    }
    }




