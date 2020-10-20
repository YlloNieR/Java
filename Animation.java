import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Animation extends JPanel implements KeyListener {
    // Timer tm = new Timer(5, this);
    int x = 0;
    int y = 0;
    int xy = 0;
    int geschwindigkeitX = 0; // ohne Scanner
    int geschwindigkeitY = 0; // ohne Scanner
    // Scanner s = new Scanner(System.in);

    int geschwindigkeitXY = 0;

    public void actionPerformed(ActionEvent e) {
        x = x + geschwindigkeitX; // von Oben nach Unten 1.3
        y = y + geschwindigkeitY; // von Oben nach Unten 1.3
        // x = x + geschwindigkeitXY+3; // von Oben nach Unten 1.2
        // y = y + geschwindigkeitXY; // von Oben nach Unten 1.2
        // xy = xy + geschwindigkeitXY;
        // xy = xy + geschwindigkeitXY;
        repaint();
    }

    public void keyPressed(KeyEvent keyEvent) {
        //System.out.println("key pressed");
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.x = this.x - 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.x = this.x + 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.y = this.y - 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.y = this.y + 5;
        }
        repaint();
    }

    public void keyReleased(KeyEvent keyEvent) {
        //System.out.println("key released");
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.geschwindigkeitX = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.geschwindigkeitX = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.geschwindigkeitY = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.geschwindigkeitY = 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        // 0,0 linke Ecke
        // g.fillRect(x, 30, 50, 30); // von links nach rechts
        // g.fillRect(30, y, 50, 30); // 1.1
        // g.fillRect(x, y, 50, 30); // 1.2
        g.fillRect(x, y, 50, 30); // 1.3
        // tm.start();
    }

    public static void main(String[] args) {

        Animation ve = new Animation();
        JFrame jf = new JFrame();
        // System.out.println("Wie weit soll das Viereck fahren?");
        // ve.geschwindigkeitXY = ve.s.nextInt();
        // ve.geschwindigkeitXY = 1; // 1.2

        jf.setTitle("Viereck Animation");
        jf.setVisible(true);
        jf.setSize(400, 150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ve);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setLocation(dim.width / 2 - jf.getSize().width / 2, dim.height / 2 - jf.getSize().height / 2);
        jf.addKeyListener(ve);
    }

}
