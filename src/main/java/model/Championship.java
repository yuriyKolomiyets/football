package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "championships")
public class Championship extends IdEntity {

    @Column
    private String country;

    private List <Game> games;

    public Championship() {
    }

    public Championship(String country, List<Game> games) {
        this.country = country;
        this.games = games;
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
