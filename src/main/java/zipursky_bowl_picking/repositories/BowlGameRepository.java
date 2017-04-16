package zipursky_bowl_picking.repositories;

import org.springframework.stereotype.Repository;
import zipursky_bowl_picking.entities.BowlGame;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/16/17.
 */
@Repository
public interface BowlGameRepository {

    List<BowlGame> getBowlGames();

}
