package Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel panel1;
    private JTextField jugadorTextField;
    private JTextField HOSTTextField;
    private JTextField puertoTextField;
    private JButton ingresarButton;
    private JButton salirButton;
    private JLabel nombreUsuarioLabel;
    private JLabel hostNameLabel;
    private JLabel puertoLabel;

    public Menu(){
        super("Menu");
        setContentPane(panel1);
        // Conectarse al servidor
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Salir del juego
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



}
