package com.mycompany.entity.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ReservationView extends JFrame {

    public Box addReservationBox() {

        JFrame reservationFrame = new JFrame("Reservation");
        JPanel reservationPanel = new JPanel();
        JButton bReservation = new JButton("Reservation");
        JButton bReservation1 = new JButton("test");
        JButton bReservation2 = new JButton("test2");
        JButton bReservation3 = new JButton("tes23t");
        JButton bReservation4 = new JButton("t2est");
        JButton bReservation5 = new JButton("te321st");
        JButton bReservation6 = new JButton("test");
        JButton bReservation7 = new JButton("test");
        JButton bReservation8 = new JButton("test");
        JButton bReservation9 = new JButton("test");
        JButton bReservation10 = new JButton("test");
        JButton bReservation11 = new JButton("test");
        JButton bReservation12 = new JButton("test");
        JButton bReservation13 = new JButton("test");
        JButton bReservation14 = new JButton("test");
        JButton bReservation15 = new JButton("test");
        JButton bReservation16= new JButton("test");
        JButton bReservation17 = new JButton("test");
        JButton bReservation18 = new JButton("test");
        JButton bReservation19 = new JButton("test");
        JButton bReservation20 = new JButton("test");

        Box editsPanel3 = Box.createVerticalBox();

        editsPanel3.add(bReservation);
        reservationFrame.pack();
        reservationFrame.add(reservationPanel);

        List<JButton> buttonList = new ArrayList<JButton>();
        for(int i = 0; i < 50; i++) {
            JButton button = new JButton();
            buttonList.add(button);
            reservationPanel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int clickCount = 0;
                    clickCount++;
                    if (clickCount % 2 == 0) {
                        System.out.println("Red");
                        button.setBackground(Color.RED);
                    } else {
                        System.out.println("Green");
                        button.setBackground(Color.GREEN);
                    }
                }
            });
        }



        bReservation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reservationFrame.setVisible(true);
                reservationFrame.setSize(250, 250);
            }
        });















        return editsPanel3;
    }


}





