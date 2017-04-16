package zipursky_bowl_picking.mapper;

import org.springframework.jdbc.core.RowMapper;
import zipursky_bowl_picking.entities.BowlGame;
import zipursky_bowl_picking.entities.FootballTeam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by Aaron Zipursky on 12/13/16.
 */
public class BowlGameMapper implements RowMapper<BowlGame>{

    public BowlGame mapRow(ResultSet rs, int rowNum) throws SQLException {
        BowlGame bowlGame = new BowlGame();

        bowlGame.setBowlName(rs.getString("bowl_name"));
        bowlGame.setHomeTeam(new FootballTeam(rs.getString("home_school_name")));
        bowlGame.setAwayTeam(new FootballTeam(rs.getString("away_school_name")));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dateFormatter = dateFormatter.withLocale(Locale.US);
        bowlGame.setGameDate(LocalDate.parse(rs.getString("game_date"), dateFormatter));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        timeFormatter = timeFormatter.withLocale(Locale.US);
        bowlGame.setGameTime(LocalTime.parse(rs.getString("game_time"), timeFormatter));

        return bowlGame;
    }

}
