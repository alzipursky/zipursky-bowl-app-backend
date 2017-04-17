package zipursky_bowl_picking.entities;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class Pick {

    private Integer id;
    private String player;
    private String bowlGame;
    private String pickedTeam;

    public Pick(){}

    public Pick(String player, String bowlGame, String pickedTeam) {
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getBowlGame() {
        return bowlGame;
    }

    public void setBowlGame(String bowlGame) {
        this.bowlGame = bowlGame;
    }

    public String getPickedTeam() {
        return pickedTeam;
    }

    public void setPickedTeam(String pickedTeam) {
        this.pickedTeam = pickedTeam;
    }
}
