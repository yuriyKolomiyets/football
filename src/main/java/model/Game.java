package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
public class Game extends IdEntity {

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn (name = "home_team")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn (name = "away_team")
    private Team awayTeam;

    @Embedded
    private Score score;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "championship")
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

    @Embeddable
    private static class Score{
        private Integer homeTeamScore;
        private Integer awayTeamScore;

        public Score() {
        }

        public Score(Integer homeTeamScore, Integer awayTeamScore) {
            this.homeTeamScore = homeTeamScore;
            this.awayTeamScore = awayTeamScore;
        }

        public Integer getHomeTeamScore() {
            return homeTeamScore;
        }

        public void setHomeTeamScore(Integer homeTeamScore) {
            this.homeTeamScore = homeTeamScore;
        }

        public Integer getAwayTeamScore() {
            return awayTeamScore;
        }

        public void setAwayTeamScore(Integer awayTeamScore) {
            this.awayTeamScore = awayTeamScore;
        }
    }
}
