package Cliente;

import Servidor.Server;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*Server server= new Server(5000);
                server.run();*/
                JFrame frame = new Menu();
                frame.setSize(300, 300);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);


            }
        });
    }
}
