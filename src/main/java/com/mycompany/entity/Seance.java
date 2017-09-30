package com.mycompany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seance")

public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seance_id;


    @Column(name = "hour")
    private int hour;

    @Column(name = "room")
    private int room;

    public int getSeance_id() {
        return seance_id;
    }

    public void setMovie_id(int seance_id) {
        this.seance_id = seance_id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie_id=" + seance_id +
                ", hour=" + hour +
                ", room=" + room +
                '}';
    }
}
