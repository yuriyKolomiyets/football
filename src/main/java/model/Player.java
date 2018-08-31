package model;

public class Player {

    private String id;
    private String firstName;
    private String lastName;
    private enum nationality {one, two, three};
    private int age;
    private int number;
    private int height;
    private int weight;
    private Team team;

    public Player() {
    }

    public Player(String firstName, String lastName, int age, int number, int height, int weight, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.number = number;
        this.height = height;
        this.weight = weight;
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
}
