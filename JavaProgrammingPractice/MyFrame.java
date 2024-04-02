import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("Testing GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(29,90,120));

        ImageIcon image = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\NationalUniversityLogo.jpg");
        this.setIconImage(image.getImage());
    }
}
