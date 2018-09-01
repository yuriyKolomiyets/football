package model;

public class Coach {

    private String id;
    private String firstName;
    private String lastName;

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

    public Coach(String firstName, String lastName, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    public String getId() {
        return id;
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
}