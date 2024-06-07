package at.ac.fhcampuswien.fhmdb.controllers;

import at.ac.fhcampuswien.fhmdb.models.Movie;
import javafx.collections.ObservableList;

import java.util.List;

public interface SortState {
    void sort(MovieListController context, ObservableList<Movie> movies);
}

