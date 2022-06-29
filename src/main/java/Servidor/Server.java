package Servidor;

import Cliente.Conexion;

import java.io.IOException;

public class Server extends Conexion {

    public Server() throws IOException{
        super("server");}

    public void startServer(){
        try{
            System.out.println("Esperando");
            cs = ss.accept();
            System.out.println("Cliente en linea");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}
