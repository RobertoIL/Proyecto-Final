package Cliente;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Menu();
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }

}
