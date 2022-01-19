package FontSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;

    JButton arial;
    JButton verdana;
    JButton consolas;
    JButton tmr;
    JButton jkrman;
    JButton addSize;
    JButton minusSize;

    JLabel label;
    int fontSize = 30;


    public JFontSelector() {
        frame = new JFrame();
        frame.setTitle("JFontSelector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        JPanel buttonPanels = new JPanel();
        buttonPanels.setLayout(new GridLayout(7, 1));

        arial = CreateButton("Arial");
        buttonPanels.add(arial);
        verdana = CreateButton("Verdana");
        buttonPanels.add(verdana);
        consolas = CreateButton("Consolas");
        buttonPanels.add(consolas);
        tmr = CreateButton("Times New Roman");
        buttonPanels.add(tmr);
        jkrman = CreateButton("Jokerman");
        buttonPanels.add(jkrman);

        addSize = new JButton("+");
        buttonPanels.add(addSize);
        addSize.addActionListener(this);

        minusSize = new JButton("-");
        buttonPanels.add(minusSize);
        minusSize.addActionListener(this);

        frame.add(buttonPanels, BorderLayout.WEST);

        label = new JLabel("This is a sample text");
        label.setFont(new Font("Arial", Font.PLAIN, fontSize));
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFontSelector instance = new JFontSelector();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addSize)
        {
            fontSize += 2;
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, fontSize));
        }
        else if(e.getSource() == minusSize)
        {
            fontSize -= 2;
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, fontSize));
        }
        else
        {
            setFont((JButton)e.getSource());
        }
    }

    private JButton CreateButton(String fontName)
    {
        JButton button = new JButton(fontName);
        button.setFont(new Font(fontName, Font.PLAIN, 10));
        button.addActionListener(this);
        return button;
    }

    private void setFont(JButton button)
    {
        label.setFont(new Font(button.getText(), Font.PLAIN, fontSize));
    }
}