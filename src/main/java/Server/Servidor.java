/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;
import java.awt.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Servidor extends Component {
    ServerSocket server;
    private String host;
    private int puerto;
    
    public Servidor(){
        try{
            server = new ServerSocket(puerto);
            mensajeria("Cliente conectado desde la direccion");
            
            //BufferedReader entrada = new BufferedReader(new InputStreamReader(server.accept().getInputStream()));
            DataInputStream entrada = new DataInputStream(server.accept().getInputStream());
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
