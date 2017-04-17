package zipursky_bowl_picking.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import zipursky_bowl_picking.entities.BowlGame;
import zipursky_bowl_picking.mapper.BowlGameMapper;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/16/17.
 */
@Component
public class BowlGameRepositoryImpl implements BowlGameRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${bowl_game.select.all}")
    private String selectBowlGames;

    @Override
    public List<BowlGame> getBowlGames(){
        return jdbcTemplate.query(selectBowlGames, new BowlGameMapper());
    }

}
