package com.mycompany.entity.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
//Image cinemaImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\macla\\OneDrive\\Obrazy\\cinema.jpg");
public class Window extends JFrame {
    //test tables
    String[] moviesTab = { "movie1", "movie2", "movie3", "movie4", "movie5" };
    String[] hoursTab = { "12:00", "14:00", "16:00", "18:00", "20:00" };
    String[] peopleTab = { "1", "2", "3", "4", "5" };
    String[] cinemaHallTab = { "Cinema hall 1", "Cinema hall 2", "Cinema hall 3", "Cinema hall 4", "Cinema hall 5" };
    //main tables view
    String[] columnMovie = {"MOVIE ID", "TITLE", "YEAR", "DURATION", "DIRECTOR"};
    String[][] dataMovie={ {"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"},{"1","movie1","year1","duration1","director1"}};
    JTable tableMovie = new JTable(dataMovie,columnMovie);

    String[] columnHalls = {"HALL NUMBER", "NUMBER OF SEATS", "FREE SEATS"};
    String[][] dataHalls = {{"1","50", "50"},{"2","50","50"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"},{"3","70","70"}};
    JTable tableHalls = new JTable(dataHalls,columnHalls);
    //Jpanels creating
    JPanel main = new JPanel();
    JPanel edits = new JPanel();
    JPanel tesst = new JPanel();
    //Box creating
    Box editsPanel1 = Box.createVerticalBox();
    Box editsPanel2 = Box.createVerticalBox();
    Box editsPanel3 = Box.createVerticalBox();

    //Tabed pane creating
    JTabbedPane tabbedPane = new JTabbedPane();

    //Text fields creating
    JTextField movies = new JTextField();
    JTextField halls = new JTextField();
    JTextField showing = new JTextField();
    JTextField reservations = new JTextField();
    JTextField movieTitle = new JTextField("Title");
    JTextField mainActor = new JTextField("Main Actor");
    JTextField director = new JTextField("Director");
    JTextField dateOfProduction = new JTextField("Date of production");
    JTextField length = new JTextField("Length");
    JTextField Showing = new JTextField("Showing");
    //JLabel creating
    JLabel addMovie = new JLabel("Add movie:");
    JLabel addSeance = new JLabel("Add seance");
    //Jbuttons creating
    JButton bAddMovie = new JButton("ADD MOVIE!");
    JButton bAddSeance = new JButton("ADD SEANCE!");
    //JComboBox vreating
    JComboBox movieListToComboBox = new JComboBox(moviesTab);
    JComboBox hoursListToComboBox = new JComboBox(hoursTab);
    JComboBox peopleListToComboBox = new JComboBox(peopleTab);
    JComboBox cinemaHallsListToComboBox = new JComboBox(cinemaHallTab);

    //Window final view
    public Window(){
        setVisible(true);
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane.add("Main View",main);
        tabbedPane.add("Edit things",edits);
        tabbedPane.add("testowo",tesst);
        add(tabbedPane);

        main.setLayout(new GridLayout(1,4,10,10));

        main.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        main.add(new JScrollPane(tableMovie));
        tableMovie.setAutoCreateRowSorter(true);
        tableMovie.setEnabled(false);
        main.add(new JScrollPane(tableHalls));
        tableHalls.setAutoCreateRowSorter(true);
        tableHalls.setEnabled(false);
        main.add(showing);
        main.add(reservations);

        edits.setLayout(new BorderLayout());

        editsPanel1.add(addMovie);
        editsPanel1.add(movieTitle);
        movieTitle.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(mainActor);
        mainActor.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(director);
        director.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(dateOfProduction);
        dateOfProduction.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(length);
        length.setMaximumSize(new Dimension(300, 30));
        editsPanel1.add(bAddMovie);

        editsPanel2.add(addSeance);
        editsPanel2.add(movieListToComboBox);
        movieListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(hoursListToComboBox);
        hoursListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(cinemaHallsListToComboBox);
        cinemaHallsListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(bAddSeance);

        edits.add(editsPanel1, BorderLayout.WEST);
        edits.add(editsPanel2, BorderLayout.EAST);
        edits.add(editsPanel3, BorderLayout.CENTER);

    }

}

