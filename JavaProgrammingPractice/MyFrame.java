import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    MyFrame() {

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,250));
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.lightGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Java Swing Flow Layout practice");
        this.setLayout(new FlowLayout());
        this.add(panel);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.setVisible(true);
    }
}