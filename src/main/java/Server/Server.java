/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Server {
    ServerSocket server;
    private String host;
    private int puerto;
    
    public Server(){
        try{
            server = new ServerSocket(puerto);
            mensajeria("Cliente conectado desde la direccion");
            
            DataInputStream entrada = new DataInputStream(server.getInputStream());
            HiloServidor hilo = new HiloServidor(server, entrada.readUTF(), this);
            hilo.start();        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    
    public void mensajeria(String msg){
        
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Serverform().setVisible(true);
       });
      
    }
    
    
    
}
