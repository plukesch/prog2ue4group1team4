package at.ac.fhcampuswien.fhmdb.controllers;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.ObservableList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnsortedState implements SortState {
    public void sort(MovieListController context, ObservableList<Movie> movies) {
        // No sorting required for unsorted state
        context.setMovieList(context.getAllMovies());
        context.setCurrentState(new AscendingState());
    }
}

