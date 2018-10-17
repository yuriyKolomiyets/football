package service;

import model.Coach;
import model.Team;

public interface ICoachService {

    Coach create(String firstName, String lastName, Coach.Nationality nationality, Team team);

    Coach read(String firstName, String lastName);

    Coach update(Coach.Nationality nationality, Team team);

    Coach delete(String firstName, String lastName);
}
