/*

package pl.edu.wszib.savingtheworld.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {

    @Autowired
    PodatnikDao podatnikDao;

    @Autowired
    FakturaDAO fakturaDAO;

    @PostConstruct
    public void init() {

            IntStream.range(0, 10).forEach(i -> {
            Podatnik podatnik = new Podatnik("adam" + i , "adam" + i);
            Podatnik podatnikSaved = podatnikDao.save(podatnik);



            IntStream.range(0,1).forEach(j -> {
                Faktura faktura = new Faktura(3, "za cos" + j);
                faktura.setPodatnik(podatnikSaved);
                faktura = fakturaDAO.save(faktura);
            });

        });
        System.out.println();
    }

    @PreDestroy
    public void teardown(){

    }
}

*/
