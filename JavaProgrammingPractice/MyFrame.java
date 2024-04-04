import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();

    MyFrame() {

        button.setFocusable(false);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        textField.setPreferredSize(new Dimension(250,40));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setFont(new Font("Arial",Font.BOLD,25));

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            button.setEnabled(false);
            textField.setEditable(false);
            System.out.println("Hello "+textField.getText());
        }
    }
}
