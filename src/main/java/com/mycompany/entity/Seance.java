package com.mycompany.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "seance")

public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seance_id;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "room")
    private int room;

    @Column(name = "num_rows")
    private int roomNumRows;

    @Column(name = "num_cols")
    private int roomNumCols;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;

    public int getSeance_id() {
        return seance_id;
    }

    public void setSeance_id(int seance_id) {
        this.seance_id = seance_id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getRoomNumRows() {
        return roomNumRows;
    }

    public void setRoomNumRows(int roomNumRows) {
        this.roomNumRows = roomNumRows;
    }

    public int getRoomNumCols() {
        return roomNumCols;
    }

    public void setRoomNumCols(int roomNumCols) {
        this.roomNumCols = roomNumCols;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "seance_id=" + seance_id +
                ", time=" + time +
                ", room=" + room +
                ", roomNumRows=" + roomNumRows +
                ", roomNumCols='" + roomNumCols + '\'' +
                ", movie=" + movie +
                '}';
    }
}


