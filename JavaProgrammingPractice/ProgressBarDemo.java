import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame("ProgressBar Demo");
    JProgressBar progressBar = new JProgressBar(0,500);

    ProgressBarDemo() {

        progressBar.setValue(0);
        progressBar.setBounds(0,0,420, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV boli",Font.BOLD,25));
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.add(progressBar);
        frame.setVisible(true);

        fill();
    }
    public void fill() {
        int counter = 500;

        while(counter>0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        progressBar.setString("Game over!");
    }
}