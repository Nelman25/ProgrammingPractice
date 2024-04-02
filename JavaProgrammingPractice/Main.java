import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\like (1).png");

        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(image);
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 75,75);
        
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        // redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        // bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0,250,250,250);   
        // yellowPanel.setLayout(new BorderLayout());
        yellowPanel.setLayout(null);

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.orange);
        orangePanel.setBounds(250,250,250,250);
        // orangePanel.setLayout(new BorderLayout()); 
        orangePanel.setLayout(null);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.setLayout(null);
        orangePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(yellowPanel);
        frame.add(orangePanel);
    }
}
