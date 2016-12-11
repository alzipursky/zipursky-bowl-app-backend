package zipursky_bowl_picking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zipursky_bowl_picking.repositories.TestRepository;

/**
 * Created by aaronzipursky1 on 12/11/16.
 */
@Component
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public Integer GetConferenceCount(){
        return testRepository.GetConferenceCount();
    }

}
