package Cliente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Juego {


   // ArrayList<Jugador> jugadores = new ArrayList<>();
    List<String> palabras = new ArrayList<>();

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
