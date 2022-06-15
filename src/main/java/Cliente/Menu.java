package Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


public class Menu extends JPanel {
    BufferedImage image;
    Graphics2D g2d;

    public Menu() {
        super();
        init();
    }

    private void init() {
        setBackground(Color.WHITE);

        image = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        g2d = image.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));

        MouseAdapter mouseHandler = new MouseAdapter() {
            private Point curPoint = new Point();

            @Override
            public void mousePressed(MouseEvent e) {
                curPoint.setLocation(e.getPoint());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                g2d.drawLine(curPoint.x, curPoint.y, e.getX(), e.getY());
                curPoint.setLocation(e.getPoint());
                repaint();
            }
        };
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pinturillo");
            frame.setMinimumSize(new Dimension(640, 480));
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(new Menu());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}



