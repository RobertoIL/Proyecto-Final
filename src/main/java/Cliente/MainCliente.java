package Cliente;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import Cliente.Cliente;


public class MainCliente{
    public static void main(String[] args) {
        try {
            int i=0;
            Socket s=new Socket("localhost",3000);
            OutputStream o = s.getOutputStream();


            while ((char)i !='q')
            {
                i = System.in.read();
                o.write((char)i);

            }
            s.close();
        } catch(Exception e) {System.out.println("Error"); }



    }
    }


