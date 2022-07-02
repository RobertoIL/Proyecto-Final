package Servidor;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable {
    private ArrayList<Socket> clientes;//arreglo de jugadores aqui se conectaran los jugadores
    private int puerto;

    public Server(int puerto) {
        this.puerto = puerto;//puerto de cada jugador
        this.clientes=new ArrayList<>();//creacion de nuevos clientes jugadores
    }

    @Override
    public void run() {

        ServerSocket server = null;
        Socket sc = null;
        DataInputStream in;

        try {
            server = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            while (true) {

                sc = server.accept();
                System.out.println("CLiente conectado");
            clientes.add(sc);//se agrega un nuevo cliente



            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addObserver(Frm2 frm2) {
    }
}
/*
//codigo original
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
*/


