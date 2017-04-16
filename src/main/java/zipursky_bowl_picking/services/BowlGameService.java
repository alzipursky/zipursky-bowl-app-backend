package zipursky_bowl_picking.services;

import org.springframework.stereotype.Service;
import zipursky_bowl_picking.entities.BowlGame;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/16/17.
 */
@Service
public interface BowlGameService {

    List<BowlGame> getBowlGames();

}
