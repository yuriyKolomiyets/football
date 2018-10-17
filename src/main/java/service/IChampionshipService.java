package service;

import model.Championship;
import model.Game;

import java.util.Set;

public interface IChampionshipService {

    Championship create(String country, Set<Game> games);

    Championship read(String country);

    Championship update(Set<Game> games);

    Championship delete(String country);
}
