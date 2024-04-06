import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button = new JButton("Choose file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("C:\\Users\\Jonel Villaver\\Desktop"));

            //int response = chooser.showOpenDialog(null);      // this will select file to open
            int response = chooser.showSaveDialog(null); // this will select a file to save (it doesn't create the file yet)

            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); // prints the absolute path of selected file
            }
        }
    }
}