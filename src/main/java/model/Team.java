package model;

import java.util.List;

public class Team {

    private String id;
    private String name;
    private String city;
    private Coach coach;
    private List <Player> players;
    private Championship championship;

    public Team() {
    }

    public Team(String name, String city, Coach coach, List<Player> players, Championship championship) {
        this.name = name;
        this.city = city;
        this.coach = coach;
        this.players = players;
        this.championship = championship;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }
}
