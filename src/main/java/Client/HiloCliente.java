package Client;


import javax.swing.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloCliente extends Thread {
private Socket SocketCliente;
private DataInputStream entrada;
private Cliente jugador;
private ObjectInputStream entradaObjeto;

public HiloCliente(Socket SocketCliente, Cliente cliente){
    this.SocketCliente=SocketCliente;
    this.jugador=cliente;
}

public void run(){//hilo de cliente en linea
    while (true){
        try {
            entrada=new DataInputStream(SocketCliente.getInputStream());
            jugador.mensajeria(entrada.readUTF());

            entradaObjeto=new ObjectInputStream(SocketCliente.getInputStream());
            jugador.actualizarLista((DefaultListModel) entradaObjeto.readObject());

        }catch (ClassNotFoundException ex){
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex ){
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE,null,ex);
        }
    }



}


}
