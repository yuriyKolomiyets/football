package service;

import model.Coach;
import model.Player;
import model.Team;

import java.util.List;

public interface IPlayerService {

    Player create(String firstName, String lastName, Coach.Nationality nationality, int age, int number, int height,
                  int weight, Team team);

    List<Player> read();

    Player update(String firstName, String lastName, Coach.Nationality nationality);

    Player delete(String firstName, String lastName);
}
