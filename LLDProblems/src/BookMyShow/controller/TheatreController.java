package BookMyShow.controller;

import BookMyShow.City;
import BookMyShow.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Theatre tight with city
public class TheatreController {

    Map<City, List<Theatre>> cityListMap;
    List<Theatre> theatreList;

    public TheatreController(){
        cityListMap = new HashMap<>();
        theatreList = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre) {
        List<Theatre> theatres = new ArrayList<>();
        theatres.add(theatre);
        cityListMap.put(city, theatres);
    }

    public List<Theatre> getTheatreList(City city) {
        return cityListMap.get(city);
    }

}
