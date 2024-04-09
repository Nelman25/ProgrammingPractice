import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testing implements ActionListener {

    JFrame frame = new JFrame();

    JPanel yellowHeader = new JPanel();
    JPanel blueHeader = new JPanel();
    JPanel booksContainer = new JPanel();
    JPanel searchArea = new JPanel();

    JButton AtomicHabits = new JButton();
    JButton EgoIsTheEnemy = new JButton();
    JButton StillnessIsTheKey = new JButton();
    JButton SubtleArt = new JButton();
    JButton ArtOfWar = new JButton();
    JButton EatThatFrog = new JButton();
    JButton AuthorPOV = new JButton();
    JButton PsychMoney = new JButton();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();

    ImageIcon NuLogo = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\NULogoResized.png");
    ImageIcon atomicHabitsImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Pictures\\AtomicHabits (1).jpg");
    ImageIcon EgoIsTheEnemyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\ego-is-the-enemy_3.jpg");
    ImageIcon StillnessIsTheKeyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EgoIsTheEnemy.jpg");
    ImageIcon SubtleArtImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-subtle-art-of-not-giving-a-f-ck.jpg");
    ImageIcon ArtOfWarImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\the-art-of-war-74.jpg");
    ImageIcon EatThatFrogImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\EatThatFrog.jpg");
    ImageIcon AuthorPOVImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Pictures\\AtomicHabits (1).jpg");
    ImageIcon PsychMoneyImg = new ImageIcon("C:\\Users\\Jonel Villaver\\Downloads\\AuthorPOV.jpg");

    Testing() {
        frame.setTitle("National University Library System");
        frame.setSize(1800, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(235,237,237));
        frame.setResizable(false);
        frame.setLayout(null);

        yellowHeader.setBounds(0,0,1800,100);
        yellowHeader.setBackground(new Color(255,219,38));
        yellowHeader.setLayout(null);

        blueHeader.setBounds(0,100,1800,15);
        blueHeader.setBackground(new Color(11,67,135));
        blueHeader.setLayout(null);

        label.setText("Public Library System");
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        label.setForeground(new Color(49, 73, 153));
        label.setIconTextGap(53);
        label.setBounds(15,10,600,60);
        label.setIcon(NuLogo);

        label2.setText("Education that works.");
        label2.setFont(new Font("Helvetica",Font.BOLD,17));
        label2.setForeground(new Color(49, 73, 153));
        label2.setBounds(660,26,250,30);

        booksContainer.setLayout(new FlowLayout());
        booksContainer.setBounds(10, 160,1730,790);

        AtomicHabits.setText("Atomic Habits");
        AtomicHabits.setBackground(new Color(235,237,237));
        AtomicHabits.setFocusable(false);
        AtomicHabits.setBorderPainted(false);
        AtomicHabits.setFont(new Font("Arial",Font.PLAIN,19));
        AtomicHabits.setHorizontalTextPosition(JLabel.CENTER);
        AtomicHabits.setVerticalTextPosition(JLabel.BOTTOM);
        AtomicHabits.setIcon(atomicHabitsImg);

        EgoIsTheEnemy.setText("Ego is The Enemy");
        EgoIsTheEnemy.setBackground(new Color(235,237,237));
        EgoIsTheEnemy.setFocusable(false);
        EgoIsTheEnemy.setBorderPainted(false);
        EgoIsTheEnemy.setFont(new Font("Arial",Font.PLAIN,19));
        EgoIsTheEnemy.setHorizontalTextPosition(JLabel.CENTER);
        EgoIsTheEnemy.setVerticalTextPosition(JLabel.BOTTOM);
        EgoIsTheEnemy.setIcon(EgoIsTheEnemyImg);

        StillnessIsTheKey.setText("Stillness Is The Key");
        StillnessIsTheKey.setBackground(new Color(235,237,237));
        StillnessIsTheKey.setFocusable(false);
        StillnessIsTheKey.setBorderPainted(false);
        StillnessIsTheKey.setFont(new Font("Arial",Font.PLAIN,19));
        StillnessIsTheKey.setHorizontalTextPosition(JLabel.CENTER);
        StillnessIsTheKey.setVerticalTextPosition(JLabel.BOTTOM);
        StillnessIsTheKey.setIcon(StillnessIsTheKeyImg);

        SubtleArt.setText("Subtle Art of Not Giving a F*ck");
        SubtleArt.setBackground(new Color(235,237,237));
        SubtleArt.setFocusable(false);
        SubtleArt.setBorderPainted(false);
        SubtleArt.setFont(new Font("Arial",Font.PLAIN,19));
        SubtleArt.setHorizontalTextPosition(JLabel.CENTER);
        SubtleArt.setVerticalTextPosition(JLabel.BOTTOM);
        SubtleArt.setIcon(SubtleArtImg);

        ArtOfWar.setText("Art of War");
        ArtOfWar.setBackground(new Color(235,237,237));
        ArtOfWar.setFocusable(false);
        ArtOfWar.setBorderPainted(false);
        ArtOfWar.setFont(new Font("Arial",Font.PLAIN,19));
        ArtOfWar.setHorizontalTextPosition(JLabel.CENTER);
        ArtOfWar.setVerticalTextPosition(JLabel.BOTTOM);
        ArtOfWar.setIcon(ArtOfWarImg);

        EatThatFrog.setText("Eat That Frog");
        EatThatFrog.setBackground(new Color(235,237,237));
        EatThatFrog.setFocusable(false);
        EatThatFrog.setBorderPainted(false);
        EatThatFrog.setFont(new Font("Arial",Font.PLAIN,19));
        EatThatFrog.setHorizontalTextPosition(JLabel.CENTER);
        EatThatFrog.setVerticalTextPosition(JLabel.BOTTOM);
        EatThatFrog.setIcon(EatThatFrogImg);

        AuthorPOV.setText("Author's POV");
        AuthorPOV.setBackground(new Color(235,237,237));
        AuthorPOV.setFocusable(false);
        AuthorPOV.setBorderPainted(false);
        AuthorPOV.setFont(new Font("Arial",Font.PLAIN,19));
        AuthorPOV.setHorizontalTextPosition(JLabel.CENTER);
        AuthorPOV.setVerticalTextPosition(JLabel.BOTTOM);
        AuthorPOV.setIcon(AuthorPOVImg);

        PsychMoney.setText("Psychology of Money");
        PsychMoney.setBackground(new Color(235,237,237));
        PsychMoney.setFocusable(false);
        PsychMoney.setBorderPainted(false);
        PsychMoney.setFont(new Font("Arial",Font.PLAIN,19));
        PsychMoney.setHorizontalTextPosition(JLabel.CENTER);
        PsychMoney.setVerticalTextPosition(JLabel.BOTTOM);
        PsychMoney.setIcon(PsychMoneyImg);

        AtomicHabits.addActionListener(this);
        EgoIsTheEnemy.addActionListener(this);
        StillnessIsTheKey.addActionListener(this);
        SubtleArt.addActionListener(this);
        ArtOfWar.addActionListener(this);
        EatThatFrog.addActionListener(this);
        AuthorPOV.addActionListener(this);
        PsychMoney.addActionListener(this);


        yellowHeader.add(label);
        yellowHeader.add(label2);
        frame.add(yellowHeader);
        frame.add(blueHeader);
        booksContainer.add(AtomicHabits);
        booksContainer.add(EgoIsTheEnemy);
        booksContainer.add(StillnessIsTheKey);
        booksContainer.add(SubtleArt);
        booksContainer.add(ArtOfWar);
        booksContainer.add(EatThatFrog);
        booksContainer.add(AuthorPOV);
        booksContainer.add(PsychMoney);

        frame.add(booksContainer);
        frame.add(searchArea);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==AtomicHabits) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==EgoIsTheEnemy) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==StillnessIsTheKey) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==SubtleArt) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==ArtOfWar) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==EatThatFrog) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==AuthorPOV) {
            BookInfo bookInfo = new BookInfo();
        }
        else if(e.getSource()==PsychMoney) {
            BookInfo bookInfo = new BookInfo();
        }


    }
}
