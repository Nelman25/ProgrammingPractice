import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,40,40);
        label.setBackground(Color.red);
        label.setOpaque(true);

        upAction = new upAction();
        downAction = new downAction();
        leftAction = new leftAction();
        rightAction = new rightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
        label.getActionMap().put("upAction",upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class upAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class downAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class leftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class rightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());

        }
    }
}