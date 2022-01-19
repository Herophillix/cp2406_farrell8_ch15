package ColorFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColorFrame implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    JPanel northPanel;
    JPanel eastPanel;
    JPanel southPanel;
    JPanel westPanel;
    Random random;
    JButton button;

    public JColorFrame() {
        frame = new JFrame();
        frame.setTitle("JColorFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        random = new Random();

        northPanel = new JPanel();
        northPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        northPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(northPanel, BorderLayout.NORTH);

        eastPanel = new JPanel();
        eastPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(eastPanel, BorderLayout.EAST);

        southPanel = new JPanel();
        southPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        southPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(southPanel, BorderLayout.SOUTH);

        westPanel = new JPanel();
        westPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        westPanel.setPreferredSize(new Dimension(100, 100));
        frame.add(westPanel, BorderLayout.WEST);

        button = new JButton("Click me");
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(100, 100));
        frame.add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JColorFrame instance = new JColorFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            switch (random.nextInt(5))
            {
                case 1 -> northPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                case 2 -> eastPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                case 3 -> southPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                case 4 -> westPanel.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            }
        }
    }
}