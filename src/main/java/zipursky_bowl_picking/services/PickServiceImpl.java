package zipursky_bowl_picking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zipursky_bowl_picking.entities.Pick;
import zipursky_bowl_picking.repositories.PickRepository;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
@Component
public class PickServiceImpl implements PickService {

    @Autowired
    PickRepository pickRepository;

    public List<Pick> getAllPicks(){
        return pickRepository.getAllPicks();
    }

}
