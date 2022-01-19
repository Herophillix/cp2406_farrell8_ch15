package Movie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JMovieFrame implements ActionListener {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;

    public JFrame frame;
    ArrayList<Movie> movies;
    ArrayList<JButton> buttons;

    public JMovieFrame() {
        frame = new JFrame();
        frame.setTitle("JMovieFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        movies = new ArrayList<Movie>();
        buttons = new ArrayList<JButton>();

        Movie northMovie = new Movie("The Wizard of Oz", 1939, "Judy Garland");
        movies.add(northMovie);
        JButton northButton = new JButton(northMovie.GetTitle());
        northButton.addActionListener(this);
        buttons.add(northButton);
        frame.add(northButton, BorderLayout.NORTH);

        Movie eastMovie = new Movie("East of Eden", 1955, "James Dean");
        movies.add(eastMovie);
        JButton eastButton = new JButton(eastMovie.GetTitle());
        eastButton.addActionListener(this);
        buttons.add(eastButton);
        frame.add(eastButton, BorderLayout.EAST);

        Movie southMovie = new Movie("Gone With The Wind", 1939, "Vivien Leigh");
        movies.add(southMovie);
        JButton southButton = new JButton(southMovie.GetTitle());
        southButton.addActionListener(this);
        buttons.add(southButton);
        frame.add(southButton, BorderLayout.SOUTH);

        Movie westMovie = new Movie("Casablanca", 1942, "Michael Curtiz");
        movies.add(westMovie);
        JButton westButton = new JButton(westMovie.GetTitle());
        westButton.addActionListener(this);
        buttons.add(westButton);
        frame.add(westButton, BorderLayout.WEST);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JMovieFrame instance = new JMovieFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton button : buttons)
        {
            if(button == e.getSource())
            {
                for(Movie movie : movies)
                {
                    if(button.getText().equals(movie.GetTitle()))
                    {
                        JOptionPane.showMessageDialog(null, movie.GetYear() + "\n" + movie.GetCast());
                        return;
                    }
                }
            }
        }
    }
}