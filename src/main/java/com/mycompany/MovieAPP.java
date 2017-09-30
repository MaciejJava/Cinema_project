package com.mycompany;

import com.mycompany.entity.Movie;
import com.mycompany.entity.Seance;
import com.mycompany.entity.dao.MovieDAO;
import com.mycompany.entity.dao.SeanceDAO;
import com.mycompany.entity.view.Window;


public class MovieAPP {

    public static void main(String[] args) {
        Window main = new Window();
        MovieDAO movieDAO = new MovieDAO();
        Movie matrix = new Movie();
        matrix.setTitle("Matrix");
        matrix.setDuration(120);
        matrix.setYear(1990);
        matrix.setDirector("Wachowsky Brothers");

        movieDAO.addMovie(matrix);

        SeanceDAO seanceDAO = new SeanceDAO();
        Seance seance1 = new Seance();
        seance1.setHour(12);
        seance1.setRoom(1);

        seanceDAO.addSeance(seance1);


    }
}
