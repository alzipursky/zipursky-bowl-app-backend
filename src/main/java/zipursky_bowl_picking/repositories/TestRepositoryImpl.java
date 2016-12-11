package zipursky_bowl_picking.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by aaronzipursky1 on 12/11/16.
 */
@Component
public class TestRepositoryImpl implements TestRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${conference.select.count}")
    private String selectConferenceCount;

    @Override
    public Integer GetConferenceCount(){
        return jdbcTemplate.queryForObject(selectConferenceCount, Integer.class);
    }

}
