package Servidor;
import javax.swing.*;

public class MainMenu extends JFrame {
    public MainMenu(){
        Pizarra p = new Pizarra();
        add(p);
    }
    public static void main(String[] args){
        MainMenu df = new MainMenu();
        df.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        df.setSize(800,600);
        df.setVisible(true);
    }
}