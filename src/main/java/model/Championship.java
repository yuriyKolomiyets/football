package model;

import java.util.List;

public class Championship {

    private String id;
    private String country;
    private List <Game> games;

    public Championship() {
    }

    public Championship(String country, List<Game> games) {
        this.country = country;
        this.games = games;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
