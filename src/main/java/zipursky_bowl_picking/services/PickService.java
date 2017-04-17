package zipursky_bowl_picking.services;

import org.springframework.stereotype.Service;
import zipursky_bowl_picking.entities.Pick;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
@Service
public interface PickService {

    List<Pick> getAllPicks();

}
