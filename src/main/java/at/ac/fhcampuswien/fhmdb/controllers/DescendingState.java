package at.ac.fhcampuswien.fhmdb.controllers;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.ObservableList;

import java.util.Comparator;
import java.util.List;

public class DescendingState implements SortState {
    @Override
    public void sort(MovieListController context, ObservableList<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getTitle).reversed());
        context.setCurrentState(new UnsortedState());
    }
}
