package zipursky_bowl_picking.entities;

import zipursky_bowl_picking.utils.Record;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class Score {

    private Integer id;
    private Player player;
    private Record playerRecord;
    private Integer bonusPoints;
    private Integer triviaPoints;

    public Score(Player player, Record playerRecord, Integer bonusPoints, Integer triviaPoints) {
        this.player = player;
        this.playerRecord = playerRecord;
        this.bonusPoints = bonusPoints;
        this.triviaPoints = triviaPoints;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Record getPlayerRecord() {
        return playerRecord;
    }

    public void setPlayerRecord(Record playerRecord) {
        this.playerRecord = playerRecord;
    }

    public Integer getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(Integer bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public Integer getTriviaPoints() {
        return triviaPoints;
    }

    public void setTriviaPoints(Integer triviaPoints) {
        this.triviaPoints = triviaPoints;
    }
}
