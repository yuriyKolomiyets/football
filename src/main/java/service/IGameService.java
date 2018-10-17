package service;


import model.Coach;
import model.Game;
import model.Team;

import java.util.Date;

public interface IGameService {

    Game create(Date date, Team homeTeam, Team awayTeam, Game.Score score);

    Game read(Date date, Team homeTeam, Team awayTeam);

    Game update(Date date, Team homeTeam, Team awayTeam, Game.Score score);

    Game delete(Date date, Team homeTeam, Team awayTeam);
}
