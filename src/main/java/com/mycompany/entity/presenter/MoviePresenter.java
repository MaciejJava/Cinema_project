package com.mycompany.entity.presenter;

import com.mycompany.entity.Movie;
import com.mycompany.entity.dao.MovieDAO;
import com.mycompany.entity.view.MovieView;
import com.mycompany.entity.view.Window;

import java.util.List;

import static com.mycompany.entity.view.Window.window;

public class MoviePresenter {

    private MovieDAO movieDAO = new MovieDAO();
    private MovieView movieView;
    Window main = window;

    public MoviePresenter(MovieView movieView) {
        this.movieView = movieView;
    }

    public void fillMovieTable() {
        List<Movie> allMovies = movieDAO.getMovieList();
        for (Movie m : allMovies) {
            String[] movieData = {String.valueOf(m.getMovie_id()), m.getTitle(), String.valueOf(m.getYear()), String.valueOf(m.getDuration()), m.getDirector()};
            window.getTableModel().addRow(movieData);
        }
    }
}
