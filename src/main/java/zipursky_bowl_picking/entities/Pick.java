package zipursky_bowl_picking.entities;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class Pick {

    private Integer id;
    private Player player;
    private BowlGame bowlGame;
    private FootballTeam pickedTeam;

    public Pick(Player player, BowlGame bowlGame, FootballTeam pickedTeam) {
        this.player = player;
        this.bowlGame = bowlGame;
        this.pickedTeam = pickedTeam;
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

    public BowlGame getBowlGame() {
        return bowlGame;
    }

    public void setBowlGame(BowlGame bowlGame) {
        this.bowlGame = bowlGame;
    }

    public FootballTeam getPickedTeam() {
        return pickedTeam;
    }

    public void setPickedTeam(FootballTeam pickedTeam) {
        this.pickedTeam = pickedTeam;
    }
}
