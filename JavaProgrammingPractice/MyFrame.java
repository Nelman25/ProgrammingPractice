import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenuItem loadItem;
    JMenuItem exitItem;
    JMenuItem saveItem;
    ImageIcon loadIcon;
    ImageIcon exitIcon;
    ImageIcon saveIcon;
    
    MyFrame() {
        this.setTitle("Java Swing Menu bar practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        loadIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\file (1).png");
        exitIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\door (1).jpg");
        saveIcon = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\save (1).png");

        menubar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);

        this.setJMenuBar(menubar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem) {
            System.out.println("You loaded an item");
        }
        else if(e.getSource()==saveItem) {
            System.out.println("You saved an item");
        }
        else if(e.getSource()==exitItem) {
            System.out.println("You exited the program");
            System.exit(0);
        }
    }
}