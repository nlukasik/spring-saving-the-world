package pl.edu.wszib.savingtheworld.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitComponent {

    @Autowired
    PodatnikDao podatnikDao;

    @PostConstruct
    public void init() {
        podatnikDao.save(new Podatnik("adam", "adam"));
        podatnikDao.save(new Podatnik("natalia", "natalia"));

    }

    @PreDestroy
    public void teardown(){

    }
}
