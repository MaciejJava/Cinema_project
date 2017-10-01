package com.mycompany.entity.view;

import javax.swing.*;
import java.awt.*;

public class SeanceView extends JFrame{

    public Box addSeanceBox() {

        //test tables
        String[] moviesTab = { "movie1", "movie2", "movie3", "movie4", "movie5" };
        String[] hoursTab = { "12:00", "14:00", "16:00", "18:00", "20:00" };
        String[] peopleTab = { "1", "2", "3", "4", "5" };
        String[] cinemaHallTab = { "Cinema hall 1", "Cinema hall 2", "Cinema hall 3", "Cinema hall 4", "Cinema hall 5" };


        JLabel addSeance = new JLabel("Add seance");
        //Jbuttons creating

        JButton bAddSeance = new JButton("ADD SEANCE!");
        //JComboBox vreating
        JComboBox movieListToComboBox = new JComboBox(moviesTab);
        JComboBox hoursListToComboBox = new JComboBox(hoursTab);
        JComboBox peopleListToComboBox = new JComboBox(peopleTab);
        JComboBox cinemaHallsListToComboBox = new JComboBox(cinemaHallTab);

        Box editsPanel2 = Box.createVerticalBox();

        editsPanel2.add(addSeance);
        editsPanel2.add(movieListToComboBox);
        movieListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(hoursListToComboBox);
        hoursListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(cinemaHallsListToComboBox);
        cinemaHallsListToComboBox.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(bAddSeance);

        return editsPanel2;

    }

    public JTable tableSeance() {

        //seance list
        String[] columnSeance = {"SEANCE ID", "HOUR", "ROOM"};
        String[][] dataSeance = {{"1", "12:00", "1"}, {"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"},{"1", "12:00", "1"}};
        JTable tableSeance = new JTable(dataSeance, columnSeance);

        return tableSeance;
    }

}
