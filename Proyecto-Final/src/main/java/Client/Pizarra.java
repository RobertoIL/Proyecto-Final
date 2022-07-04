package Client;

import java.awt.*;
import java.awt.event.*;

public class Pizarra  extends Canvas implements MouseListener, MouseMotionListener, KeyListener {
    int x=-1, y=-1, x2 =-1, y2=-1;
    boolean nnw = false;

    public Pizarra(){
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.white);
    }

    public void dibujar(Graphics g){
        Graphics2D g0 = (Graphics2D) g;
        g0.setStroke(new BasicStroke(2));
        g0.setColor(Color.black);

        if (x2 != -1 && x != -1){
            g0.drawLine(x,y,x2,y2);

        }if (nnw){
            g0.setColor(Color.white);
            g0.fillRect(-10,-10,600,600);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        dibujar(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x=-1;
        x2=-1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2=e.getX();
        y2=e.getY();
        dibujar(this.getGraphics());
        x=x2;
        y=y2;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
