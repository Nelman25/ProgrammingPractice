import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon image = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\like (1) (1).png");
        ImageIcon image2 = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\wow emoji (1).png");

        label = new JLabel();
        label.setIcon(image2);
        label.setVisible(false);
        label.setBounds(200,150,250,150);
        
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("Like");
        button.setFocusable(false);
        button.setIcon(image);
        button.setFont(new Font("Arial",Font.BOLD,14));
        button.setBackground(new Color(173,216,230));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("like");
            label.setVisible(true);
        }
    }
}