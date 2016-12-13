package zipursky_bowl_picking.utils;

/**
 * Created by Aaron Zipursky on 12/12/16.
 */
public class Record {

    private Integer wins;
    private Integer losses;

    public Record(Integer wins, Integer losses) {
        this.wins = wins;
        this.losses = losses;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }
}
