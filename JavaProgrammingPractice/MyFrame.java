import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyFrame extends JFrame {
    MyFrame() {

        JLabel label1 = new JLabel();
        label1.setBounds(50,50, 100,100);
        label1.setOpaque(true);
        label1.setBackground(Color.red);

        JLabel label2 = new JLabel();
        label2.setBounds(100,100, 100,100);
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        
        JLabel label3 = new JLabel();
        label3.setBounds(150,150, 100,100);
        label3.setOpaque(true);
        label3.setBackground(Color.blue);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));


        this.setTitle("JLayeredPane Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);


        this.add(layeredPane);
        this.setVisible(true);
    }
}