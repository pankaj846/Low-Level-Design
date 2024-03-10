package BookMyShow;

import BookMyShow.controller.MovieController;
import BookMyShow.controller.TheatreController;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {

    static MovieController movieController;
    static TheatreController theatreController;

    BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }


    public static void main(String[] args) {

        populateMovies();

        // How booking system works
        // 1. Select city
        // 2. Select movie taht user wants see
        // 3. Select all theatres corresponding to that movie
        // 4. Select available show, depends on time
        // 5. Select seat in that show
        // 6. Do payment
        // 7. Booking successfully

        String userLocation = "Delhi";
        String interestedMovie = "Thor";

        System.out.println("user wants to see " + interestedMovie + " in " + userLocation);

        // List of movies avialable in Delhi
        List<Movie> movieList = movieController.cityMoviesListMap.get(City.Delhi);

        System.out.println("Total Movies in " + userLocation + " : " + movieList);

        // User want to see Thor
        Movie userMovie = null;
        for(Movie movie: movieList){
            if( movie.getName() != null && movie.getName().equals("Thor")){
                userMovie = movie; // we able to fetch user interested movie
            }
        }

        // Select theatre acc. to user location
        List<Theatre> theatreList = theatreController.getTheatreList(City.Delhi);
        System.out.println("Total theatres for " + userLocation + " : " + theatreList);

        // find theatre that having Thor available
        Shows userInterestedShow = null;
        for(Theatre theatre : theatreList){
            List<Shows> shows = theatre.getShowsList();
            for(Shows show : shows){
                if(show.getMovie().equals(userMovie)) {
                    System.out.println("User selected this show having " + userMovie + " : " + show);
                    userInterestedShow = show;
                    break;

                }
            }

        }

        System.out.println(userInterestedShow);

        // book seat in the show
        System.out.println("Total empty seat in the show : " + userInterestedShow.getSeatList());
        userInterestedShow.setBookedSeatId(7);


        // pyament
        System.out.println("Payment success");

        System.out.println("Booking Confimred");

    }


    public static void populateMovies(){
        BookMyShow bookMyShow = new BookMyShow();

        // Create 2 movies => Thor and Hulk
        Movie thor = new Movie();
        thor.setMovieId(1);
        thor.setName("Thor");
        thor.setDuration(230);

        Movie hulk = new Movie();
        hulk.setMovieId(8);
        hulk.setName("Hulk");
        hulk.setDuration(260);


        // put movies in cities
        movieController.addMovies(City.Delhi, thor);
        movieController.addMovies(City.Mumbai, hulk);
        movieController.addMovies(City.Chennai, thor);
        movieController.addMovies(City.Delhi, hulk);
        movieController.addMovies(City.Mumbai, hulk);

        // Create theatres with N shows
        Theatre cinepolis = new Theatre();
        cinepolis.setTheatreId(4);
        cinepolis.setTheatreName("Cinepolis");
        cinepolis.setCity(City.Delhi);

        Theatre pvr = new Theatre();
        pvr.setTheatreId(10);
        pvr.setTheatreName("PVR");
        pvr.setCity(City.Mumbai);

        // Create Shows
        Shows cinepolisMorningShow = new Shows();
        cinepolisMorningShow.setMovie(thor);
        cinepolisMorningShow.setMovie(hulk);
        cinepolisMorningShow.setShowId(22);
        cinepolisMorningShow.setStartTime(9);

        Shows cinepolisEveningShow = new Shows();
        cinepolisEveningShow.setMovie(thor);
        cinepolisEveningShow.setShowId(30);
        cinepolisEveningShow.setStartTime(6);

        // cinepolish have 20 seat for morning show
        List<Seat> platinumSeat = new ArrayList<>();
        for(int i=0; i<20; i++){
            platinumSeat.add(new Seat());
        }

        cinepolisEveningShow.setSeatList(platinumSeat);

        // put all shows and screen in theatre
        List<Shows> showsList = new ArrayList<Shows>();
        showsList.add(cinepolisMorningShow);
        showsList.add(cinepolisEveningShow);
        cinepolis.setShowsList(showsList);


        // put theatres in corresponding to city
        theatreController.addTheatre(City.Delhi, cinepolis);
        theatreController.addTheatre(City.Mumbai, cinepolis);
        theatreController.addTheatre(City.Chennai, cinepolis);

    }

}
