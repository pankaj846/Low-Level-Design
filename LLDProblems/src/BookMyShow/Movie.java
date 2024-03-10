package BookMyShow;

public class Movie {
    int movieId;
    String name;

    int duration;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
