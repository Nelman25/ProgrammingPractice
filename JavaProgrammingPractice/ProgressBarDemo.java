import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame = new JFrame("ProgressBar Demo");
    JProgressBar progressBar = new JProgressBar();

    ProgressBarDemo() {

        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setBounds(0,0,420,50);
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);
        progressBar.setFont(new Font("MV Boli",Font.BOLD,25));

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill() {
        int counter = 100;

        while(counter>0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        progressBar.setString("Game over!");
    }
}