import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame implements MouseListener {

    JFrame frame;
    JLabel label;
    ImageIcon normal;
    ImageIcon hovered;
    ImageIcon clicked;
    ImageIcon pressed;

    MyFrame() {

        normal = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\normal.png");
        hovered = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\hovered.png");
        clicked = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\clicked.png");
        pressed = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\pressed.png");

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(624,624);
        frame.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,624,624);
        label.setIcon(normal);
        label.addMouseListener(this);

        frame.add(label);
        frame.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(clicked);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pressed);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(pressed);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(hovered);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(normal);
    }
}