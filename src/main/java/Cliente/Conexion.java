package Cliente;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {


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
