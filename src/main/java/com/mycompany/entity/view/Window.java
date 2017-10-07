package com.mycompany.entity.view;
import com.mycompany.entity.presenter.MoviePresenter;
import com.mycompany.entity.presenter.SeancePresenter;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {

    public static Window window;
    //View elements
    MovieView movieView = new MovieView();
    SeanceView seanceView = new SeanceView();
    MoviePresenter moviePresenter = new MoviePresenter(movieView);
    SeancePresenter seancePresenter = new SeancePresenter(seanceView);
    MyTableModel tableModel = new MyTableModel();
    MyTableModel tableModel2 = new MyTableModel();
    JTable tableMovie = new JTable(tableModel);
    JTable tableSeance = new JTable(tableModel2);
    Box editsPanel1 = movieView.addMovieBox();



    Box editsPanel2 = seanceView.addSeanceBox();

    //showing list
    String[] columnShowing = {"MOVIE","HALL","FREE SEATS", "ENDS AT"};
    String[][] dataShowing = {{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"},{"movie title", "hall number", "50","14:00"} };
    JTable tableShowing = new JTable(dataShowing, columnShowing);

    //Jpanels creating
    JPanel main = new JPanel();
    JPanel edits = new JPanel();

    //Box creating
    Box editsPanel3 = Box.createVerticalBox();

    //Tabed pane creating
    JTabbedPane tabbedPane = new JTabbedPane();

    //Text fields creating
    JTextField movies = new JTextField();
    JTextField halls = new JTextField();
    JTextField showing = new JTextField();
    JTextField Showing = new JTextField("Showing");


    //Window final view
    public Window(){
        setVisible(true);
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane.add("Main View",main);
        tabbedPane.add("Edit things",edits);
        add(tabbedPane);

        main.setLayout(new GridLayout(1,4,10,10));
        main.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        tableModel.addColumn("MOVIE ID");
        tableModel.addColumn("TITLE");
        tableModel.addColumn("YEAR");
        tableModel.addColumn("DIRECTOR");

        main.add(new JScrollPane(tableMovie));


        main.add(new JScrollPane(tableSeance));


        main.add(new JScrollPane(tableShowing));
        tableShowing.setAutoCreateRowSorter(true);
        tableShowing.setEnabled(false);


        edits.setLayout(new BorderLayout());
        edits.add(editsPanel1, BorderLayout.WEST);
        edits.add(editsPanel2, BorderLayout.EAST);
        edits.add(editsPanel3, BorderLayout.CENTER);

        window = this;
        moviePresenter.fillMovieTable();
        seancePresenter.fillSeanceTable();

    }

    public MyTableModel getTableModel() {
        return tableModel;
    }


    public MyTableModel getTableModel2() {
        return tableModel2;
    }
}

