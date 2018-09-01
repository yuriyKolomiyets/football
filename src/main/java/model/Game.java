package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
public class Game extends IdEntity {

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "home_team", nullable = false)
    private Team homeTeam;

    @Column(name = "away_team", nullable = false)
    private Team awayTeam;

    @Column
    private Score score;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "championship_id", referencedColumnName = "id")
    private Championship championship;

    public Game() {
    }

    public Game(Date date, Team homeTeam, Team awayTeam, Score score) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }
}
