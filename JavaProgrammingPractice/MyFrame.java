import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setTitle("Java Swing Combo box practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog", "Cat", "Cow"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
//        comboBox.setEditable(true);
//        comboBox.addItem("Horse");
//        comboBox.insertItemAt("Pig",0);
//        comboBox.removeItem("Cat");
//        comboBox.removeItemAt(0);
//        comboBox.removeAllItems();

        comboBox.setSelectedIndex(0);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedItem());
//        System.out.println(comboBox.getSelectedIndex());
        }
    }
}