package zipursky_bowl_picking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zipursky_bowl_picking.entities.BowlGame;
import zipursky_bowl_picking.repositories.BowlGameRepository;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/16/17.
 */
@Component
public class BowlGameServiceImpl implements BowlGameService {

    @Autowired
    BowlGameRepository bowlGameRepository;

    @Override
    public List<BowlGame> getBowlGames(){
        return bowlGameRepository.getBowlGames();
    }

}
