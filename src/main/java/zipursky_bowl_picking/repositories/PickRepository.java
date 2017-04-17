package zipursky_bowl_picking.repositories;

import org.springframework.stereotype.Repository;
import zipursky_bowl_picking.entities.Pick;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
@Repository
public interface PickRepository {

    List<Pick> getAllPicks();

}
