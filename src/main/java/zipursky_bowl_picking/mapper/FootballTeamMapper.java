package zipursky_bowl_picking.mapper;

import org.springframework.jdbc.core.RowMapper;
import zipursky_bowl_picking.entities.FootballTeam;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class FootballTeamMapper implements RowMapper<FootballTeam> {

    public FootballTeam mapRow(ResultSet rs, int rowNum) throws SQLException{
        FootballTeam footballTeam = new FootballTeam();

        footballTeam.setSchoolName(rs.getString("school_name"));
        footballTeam.setSchoolNickname(rs.getString("school_nick_name"));

        return footballTeam;
    }

}
