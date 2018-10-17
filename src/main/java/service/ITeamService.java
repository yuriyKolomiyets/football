package service;

import model.Championship;
import model.Coach;
import model.Player;
import model.Team;

import java.util.Set;

public interface ITeamService {

    Team create(String name, String city, Coach coach, Set<Player> players, Championship championship);

    Team read(String name, String city);

    Team update(String name, String city, Set<Player> players);

    Team delete(String name, String city);
}
