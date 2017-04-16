package zipursky_bowl_picking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zipursky_bowl_picking.entities.BowlGame;
import zipursky_bowl_picking.services.BowlGameService;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/16/17.
 */

@RestController
public class BowlGameController {

    @Autowired
    BowlGameService bowlGameService;

    @RequestMapping("/games")
    public List<BowlGame> testResponse(){
        return bowlGameService.getBowlGames();
    }

}
