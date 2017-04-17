package zipursky_bowl_picking.mapper;

import org.springframework.jdbc.core.RowMapper;
import zipursky_bowl_picking.entities.Pick;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
public class PickMapper implements RowMapper<Pick> {

    public Pick mapRow(ResultSet rs, int rowNum) throws SQLException{
        Pick pick = new Pick();

        pick.setPlayer(rs.getString("u_name"));
        pick.setBowlGame(rs.getString("bowl_name"));
        pick.setPickedTeam(rs.getString("picked_team"));

        return pick;
    }

}
