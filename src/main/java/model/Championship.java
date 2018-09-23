package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "championships")
public class Championship extends IdEntity {

    @Column
    private String country;

    @OneToMany(mappedBy = "championship", fetch = FetchType.EAGER)
    private Set <Game> games;

    public Championship() {
    }

    public Championship(String country, Set<Game> games) {
        this.country = country;
        this.games = games;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
