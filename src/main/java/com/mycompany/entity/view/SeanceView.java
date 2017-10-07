package com.mycompany.entity.view;

import com.mycompany.HibernateUtil;
import com.mycompany.entity.Movie;
import com.mycompany.entity.Seance;
import com.mycompany.entity.dao.MovieDAO;
import com.mycompany.entity.dao.SeanceDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.List;

import static com.mycompany.entity.view.Window.window;

public class SeanceView extends JFrame{

    Window main = window;
    SeanceDAO seanceDAO = new SeanceDAO();

    public Box addSeanceBox() {


        JTextField seanceTime = new JTextField("Time");
        JTextField seanceRoom = new JTextField("Room");
        JTextField seanceRoomRows = new JTextField("Row");
        JTextField seanceRoomCols = new JTextField("Cols");
        JTextField seanceMovie = new JTextField("Movie");


        JLabel addSeance = new JLabel("Add seance");
        //Jbuttons creating

        JButton bAddSeance = new JButton("ADD SEANCE!");


        Box editsPanel2 = Box.createVerticalBox();

        editsPanel2.add(addSeance);
        editsPanel2.add(seanceTime);
        seanceTime.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(seanceRoom);
        seanceRoom.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(seanceRoomRows);
        seanceRoomRows.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(seanceRoomCols);
        seanceRoomCols.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(seanceMovie);
        seanceMovie.setMaximumSize(new Dimension(300, 30));
        editsPanel2.add(bAddSeance);

        bAddSeance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Seance seance = new Seance();
                seance.setTime(LocalDateTime.parse(seanceTime.getText()));
                seance.setRoom(Integer.parseInt(seanceRoom.getText()));
                seance.setRoomNumRows(Integer.parseInt(seanceRoomRows.getText()));
                seance.setRoomNumCols(Integer.parseInt(seanceRoomCols.getText()));
                seanceDAO.addSeance(seance);
            }
        });


        return editsPanel2;

    }





}
