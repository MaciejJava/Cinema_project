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
                    int clickCount = 1;
                    clickCount++;
                    if (clickCount % 2 == 0) {
                        System.out.println("Red");
                        button.setBackground(Color.RED);
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





