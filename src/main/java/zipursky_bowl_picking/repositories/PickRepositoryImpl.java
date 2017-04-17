package zipursky_bowl_picking.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import zipursky_bowl_picking.entities.Pick;
import zipursky_bowl_picking.mapper.PickMapper;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
@Component
public class PickRepositoryImpl implements PickRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${pick.select.all}")
    String selectPicks;

    public List<Pick> getAllPicks(){
        return jdbcTemplate.query(selectPicks,new PickMapper());
    }

}
