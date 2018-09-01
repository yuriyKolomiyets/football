package model;

import javax.persistence.*;

@Entity
@Table(name = "coachs")
public class Coach extends IdEntity {

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

    ;
    private Team team;

    public Coach() {
    }

    public Coach(String firstName, String lastName, Nationality nationality, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.team = team;
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
