package at.ac.fhcampuswien.fhmdb.controllers;

import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnsortedState implements SortState {
    @Override
    public void sort(List<Movie> movies) {
        // Keine Sortierung, behält die ursprüngliche Reihenfolge bei
    }
}

