import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xImage;
    ImageIcon checkImage;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Java Swing checkbox practice");
        this.setLayout(new FlowLayout());

        xImage = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\xImage (1).png");
        checkImage = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\checkImage (1).jpg");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(xImage);
        checkBox.setSelectedIcon(checkImage);
        
        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}