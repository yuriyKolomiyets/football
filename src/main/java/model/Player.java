package model;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends IdEntity{

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Enumerated (EnumType.ORDINAL)
    private Coach.Nationality nationality;

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

    @Column
    private int age;

    @Column
    private int number;

    @Column
    private int height;

    @Column
    private int weight;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "team_id")
    private Team team;

    public Player() {
    }

    public Player(String firstName, String lastName, Coach.Nationality nationality, int age, int number, int height, int weight, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
        this.number = number;
        this.height = height;
        this.weight = weight;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Coach.Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Coach.Nationality nationality) {
        this.nationality = nationality;
    }
}
