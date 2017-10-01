package com.mycompany.entity.view;

import com.mycompany.entity.Movie;
import com.mycompany.entity.dao.MovieDAO;
import com.mycompany.entity.presenter.MoviePresenter;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MovieView extends JFrame {

    MovieDAO movieDAO = new MovieDAO();
    public Box addMovieBox() {


        JTextField movieTitle = new JTextField("Title");
        JTextField year = new JTextField("Year");
        JTextField duration = new JTextField("Duration");
        JTextField director = new JTextField("Director");

        JButton bAddMovie = new JButton("ADD MOVIE!");

        JLabel addMovie = new JLabel("Add movie:");

        Box editsPanel1 = Box.createVerticalBox();

        editsPanel1.add(addMovie);
        editsPanel1.add(movieTitle);
        movieTitle.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(year);
        year.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(duration);
        duration.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(director);
        director.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(bAddMovie);

        bAddMovie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Movie movie = new Movie();
                movie.setTitle( movieTitle.getText());
                movie.setYear(Integer.parseInt(year.getText()));
                movie.setDuration(Integer.parseInt(duration.getText()));
                movie.setDirector(director.getText());
                movieDAO.addMovie(movie);
            }
        });

        return editsPanel1;


    }

/*    public JTable tableMovie() {

        String[] columnMovie = {"MOVIE ID", "TITLE", "YEAR", "DURATION", "DIRECTOR"};
        String[][] dataMovie = MoviePresenter.


        return tableMovie;
        }*/




}









