package zipursky_bowl_picking.entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by aaronzipursky1 on 12/12/16.
 */
public class BowlGame {

    private Integer id;
    private String bowlName;
    private LocalDate gameDate;
    private LocalTime gameTime;
    private String tvNetwork;
    private FootballTeam homeTeam;
    private FootballTeam awayTeam;
    private Boolean isSemiFinal;
    private String city;
    private String State;
    private String Site;
    private FootballTeam winningTeam;

    public BowlGame() {}

    public BowlGame(String bowlName, FootballTeam homeTeam, FootballTeam awayTeam, Boolean isSemiFinal, LocalDate gameDate, LocalTime gameTime) {
        this.bowlName = bowlName;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.isSemiFinal = isSemiFinal;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBowlName() {
        return bowlName;
    }

    public void setBowlName(String bowlName) {
        this.bowlName = bowlName;
    }

    public LocalDate getGameDate() {
        return gameDate;
    }

    public void setGameDate(LocalDate gameDate) {
        this.gameDate = gameDate;
    }

    public LocalTime getGameTime() {
        return gameTime;
    }

    public void setGameTime(LocalTime gameTime) {
        this.gameTime = gameTime;
    }

    public String getTvNetwork() {
        return tvNetwork;
    }

    public void setTvNetwork(String tvNetwork) {
        this.tvNetwork = tvNetwork;
    }

    public FootballTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(FootballTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public FootballTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(FootballTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Boolean getSemiFinal() {
        return isSemiFinal;
    }

    public void setSemiFinal(Boolean semiFinal) {
        isSemiFinal = semiFinal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public FootballTeam getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(FootballTeam winningTeam) {
        this.winningTeam = winningTeam;
    }
}
