import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "This is just a test, lolololo, slsjsjd", "Testing Java Swing JOptionPane", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is just a test, lolololo, slsjsjd", "Testing Java Swing JOptionPane", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is just a test, lolololo, slsjsjd", "Testing Java Swing JOptionPane", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is just a test, lolololo, slsjsjd", "Testing Java Swing JOptionPane", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is just a test, lolololo, slsjsjd", "Testing Java Swing JOptionPane", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Is this tanong?", "Testing Java Swing JOptionPane", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null, "Is this tanong?", "Testing Java Swing JOptionPane", JOptionPane.OK_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null, "Is this tanong?", "Testing Java Swing JOptionPane", JOptionPane.OK_OPTION);
        JOptionPane.showConfirmDialog(null, "Is this tanong?", "Testing Java Swing JOptionPane", JOptionPane.YES_NO_OPTION);

        // Testing

        String name = JOptionPane.showInputDialog("What is your name?");
        String age = JOptionPane.showInputDialog("How old are you?");
        
        JOptionPane.showMessageDialog(null, "Your name is "+name+" \nYou are "+age+" years old", "Personal Info", JOptionPane.INFORMATION_MESSAGE);
    }
}