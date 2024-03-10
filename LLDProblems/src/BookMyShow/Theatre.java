package BookMyShow;

import java.util.List;

public class Theatre {

    String theatreName;
    int theatreId;
    City city;

    List<Shows> showsList;

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Shows> getShowsList() {
        return showsList;
    }

    public void setShowsList(List<Shows> showsList) {
        this.showsList = showsList;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", city=" + city +
                ", showsList=" + showsList +
                '}';
    }
}
