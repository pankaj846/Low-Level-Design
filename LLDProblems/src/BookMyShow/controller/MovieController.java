package BookMyShow.controller;


import BookMyShow.City;
import BookMyShow.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// movie is tight with city
public class MovieController {

    // city map with movie
    public Map<City, List<Movie>> cityMoviesListMap;

    // total list of movies
    List<Movie> movieList;

    public MovieController() {
        this.cityMoviesListMap = new HashMap<>();
        this.movieList = new ArrayList<>();
    }

    public void addMovies(City city, Movie movie){
        List<Movie> movies = cityMoviesListMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityMoviesListMap.put(city, movies);
    }

    public boolean getMovie(String city, String movie){

        List<Movie> movies = cityMoviesListMap.get(city);

        for(Movie m : movies){
            if(m.getName().equals(movie)){
                return true;
            }
        }

        return false;

    }

}
