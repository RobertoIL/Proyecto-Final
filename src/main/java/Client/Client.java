/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author rober
 */
public class Client {
    
    private Socket cliente;
    private int puerto;
    private String host;
    private DataOutputStream salida;
    private String nombre;
    
    public Client(String nombre, String host, int puerto){
        try{
            cliente = new Socket(host, puerto);
            DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
            salida.writeUTF(nombre);
            HiloCliente hilo=new HiloCliente(cliente,this);
            hilo.start();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    
    public void mensajeria(String msg){
        
    }
    
    
}
