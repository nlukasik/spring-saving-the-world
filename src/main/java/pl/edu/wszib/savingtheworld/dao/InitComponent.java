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
        IntStream.range(0,10).forEach(i -> {
                    Faktura faktura = new Faktura(3, "za cos");
                    faktura = fakturaDAO.save(faktura);
                });

        List<Faktura> wszystkie = fakturaDAO.findAll();

        IntStream.range(0, 50).forEach(i -> {
            Podatnik podatnik = new Podatnik("adam" + i , "adam" + i);
            podatnik.setFaktury(Arrays.asList(wszystkie.get(i % 10), wszystkie.get((i + 5)%10)));
            podatnik = podatnikDao.save(podatnik);
            podatnik.getImie();
        });
        System.out.println("");
    }

    @PreDestroy
    public void teardown(){

    }
}
