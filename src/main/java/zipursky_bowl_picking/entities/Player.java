package zipursky_bowl_picking.entities;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class Player {

    private Integer id;
    private String username;
    private FootballTeam almaMater;

    public Player(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FootballTeam getAlmaMater() {
        return almaMater;
    }

    public void setAlmaMater(FootballTeam almaMater) {
        this.almaMater = almaMater;
    }
}
