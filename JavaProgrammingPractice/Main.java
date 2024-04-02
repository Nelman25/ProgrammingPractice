import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\beachoten (1).png");
        Border border = BorderFactory.createLineBorder(Color.green,2);

        JLabel label = new JLabel();
        label.setText("Bitch, nigahi na ang akong oten?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font ("Arial",Font.ITALIC,20));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,250,250);
        

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Java Swing GUI Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.getContentPane().setBackground(Color.black);
        // frame.setLayout(null);
        frame.pack();

    }
}
