package zipursky_bowl_picking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zipursky_bowl_picking.services.TestService;


/**
 * Created by Aaron Zipursky on 12/10/16.
 */
@RestController
public class TestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public Integer testResponse(){
        return testService.GetConferenceCount();
    }

}
