package Servidor;




import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*public class Server extends Observable implements Runnable {

    private int puerto;

    public Server(int puerto) {
        this.puerto = puerto;
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

                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}*/

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



