import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel background;
    JLabel pacman;

    MyFrame() {

        ImageIcon image = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\PackmanBackground.jpg");
        ImageIcon image2 = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\pacman (1).png");

        this.setTitle("Fake Pacman Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);

        background = new JLabel();
        background.setBounds(0,0,600,600);
        background.setIcon(image);
        background.setOpaque(true);

        pacman = new JLabel();
        pacman.setBounds(285,290,35,35);
        pacman.setIcon(image2);
        pacman.setOpaque(true);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,600,600);
        layeredPane.add(background,Integer.valueOf(0));
        layeredPane.add(pacman,Integer.valueOf(1));

        this.addKeyListener(this);
        this.add(layeredPane);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                pacman.setLocation(pacman.getX()-3, pacman.getY());
                break;
            case 'd':
                pacman.setLocation(pacman.getX()+3, pacman.getY());
                break;
            case 'w':
                pacman.setLocation(pacman.getX(), pacman.getY()-3);
                break;
            case 's':
                pacman.setLocation(pacman.getX(), pacman.getY()+3);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println(e.getKeyChar());
//        System.out.println(e.getKeyCode());
    }
}