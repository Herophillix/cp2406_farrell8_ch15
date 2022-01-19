package VowelConsonant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JVowelConsonant implements ActionListener {
    public static final int WINDOW_WIDTH = 750;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;
    JPanel playArea;
    JLabel label;
    JButton[] buttons;
    Random random;

    public JVowelConsonant() {
        frame = new JFrame();
        frame.setTitle("JVowelConsonant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLayout(new FlowLayout());

        random = new Random();

        playArea = new JPanel();
        playArea.setPreferredSize(new Dimension(500, 500));
        playArea.setLayout(new GridLayout(2, 2));
        buttons = new JButton[4];
        for(int i = 0; i < buttons.length; ++i)
        {
            buttons[i] = new JButton(Character.toString((char)(65 + random.nextInt(25))));
            buttons[i].addActionListener(this);
            playArea.add(buttons[i]);
        }

        frame.add(playArea);

        label = new JLabel();
        playArea.setPreferredSize(new Dimension(250, 500));
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JVowelConsonant instance = new JVowelConsonant();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton button: buttons)
        {
            if(button == e.getSource())
            {
                char character = button.getText().charAt(0);
                if(character == 'A' || character == 'I' ||character == 'U' ||character == 'E' ||character == 'O')
                {
                    label.setText("Vowel");
                }
                else
                {
                    label.setText("Consonant");
                }
                button.setText(Character.toString((char)(65 + random.nextInt(25))));
                return;
            }
        }
    }
}