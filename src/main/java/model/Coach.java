package model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "coaches")
public class Coach {

    @Id
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private  Nationality nationality;

    public enum Nationality {
        UKRAINIAN(1),
        GERMAN(2),
        PORTUGAL(3);

        private Integer index;

        Nationality(Integer index) {
            this.index = index;
        }
    }

    @OneToOne(mappedBy = "coach")
    @JoinColumn (name = "team")
    private Team team;

    public Coach() {
    }

    public Coach(String firstName, String lastName, Nationality nationality, Team team) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.team = team;
    }

    public String getId() {
        return UUID.randomUUID().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}
