package Client;



import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements Runnable {

    private int puerto;
    private String mensaje;

    public Conexion(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, puerto);

            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
/*
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {





    //codigo original
   protected ServerSocket ss;
    protected Socket cs;

    public Conexion(String tipo) throws IOException{
        if (tipo.equalsIgnoreCase("server")){
            ss = new ServerSocket();
            cs = new Socket();
        }
        else {
            cs = new Socket();
        }

    }

}
*/