package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Shows {
    int showId;

    // this show has movie
    Movie movie;

    int showsStartTime;

    // This shows has list of seats
    List<Seat> seatList;

    List<Integer> bookedSeatIdList;

    Shows(){
        bookedSeatIdList = new ArrayList<>();
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    public int getStartTime() {
        return showsStartTime;
    }

    public void setStartTime(int startTime) {
        this.showsStartTime = startTime;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public List<Integer> getBookedSeatId() {
        return bookedSeatIdList;
    }

    public void setBookedSeatId(int bookedSeatId) {
        bookedSeatIdList.add(bookedSeatId);
    }

    @Override
    public String toString() {
        return "Shows{" +
                "showId=" + showId +
                ", movie=" + movie +
                ", startTime=" + showsStartTime +
                '}';
    }
}
