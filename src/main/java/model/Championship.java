package model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "championships")
public class Championship {

    @Id
    private String id;

    @Column
    private String country;

    @OneToMany(mappedBy = "championship", fetch = FetchType.EAGER)
    private Set <Game> games;

    public Championship() {
    }

    public Championship(String country, Set<Game> games) {
        this.id = UUID.randomUUID().toString();
        this.country = country;
        this.games = games;
    }

    public String getId() {
        return UUID.randomUUID().toString();
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

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
