package model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String city;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coach")
    private Coach coach;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private Set <Player> players;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Championship championship;

    public Team() {
    }

    public Team(String name, String city, Coach coach, Set<Player> players, Championship championship) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.city = city;
        this.coach = coach;
        this.players = players;
        this.championship = championship;
    }

    public String getId() {
        return UUID.randomUUID().toString();
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

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }
}
