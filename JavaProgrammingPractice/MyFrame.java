import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        this.setTitle("Java Swing Radio buttons practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");

        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        pizzaIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\pizza (1).png");
        hamburgerIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\hamburger (1).png");
        hotdogIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\hotdog (1).png");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You picked Pizza");
        }
        else if (e.getSource()==hamburgerButton) {
            System.out.println("You picked Hamburger");
        }
        else {
            System.out.println("You picked Hotdog");
        }
    }
}