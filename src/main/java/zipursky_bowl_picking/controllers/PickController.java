package zipursky_bowl_picking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zipursky_bowl_picking.entities.Pick;
import zipursky_bowl_picking.services.PickService;

import java.util.List;

/**
 * Created by aaronzipursky1 on 4/17/17.
 */
@RestController
public class PickController {

    @Autowired
    PickService pickService;

    @RequestMapping("/picks")
    public ResponseEntity<List<Pick>> getPicks(){
        return ResponseEntity.ok(pickService.getAllPicks());
    }
}
