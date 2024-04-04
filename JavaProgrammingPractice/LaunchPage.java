import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Open new window");

    LaunchPage() {

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            frame.dispose();
            new NewWindow();
        }
    }
}
