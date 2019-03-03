package pl.edu.wszib.savingtheworld.dao;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.dto.FakturaDTO;
import pl.edu.wszib.savingtheworld.dto.PodatnikDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/podatnik")
public class PodatnikController {

    @Autowired

    PodatnikDao dao;


    @Autowired
    Mapper mapper;
    @Autowired
    FakturaDAO fakturaDAO;

    @GetMapping
    public PodatnikDTO podatnik (@RequestParam Long pesel) {
        return dao.findById(pesel)
                .map (podatnik -> mapper.map(podatnik, PodatnikDTO.class))
                .orElse(null);

    }

    @GetMapping("/all")
    public List <PodatnikDTO> podatnicy() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(podatnik -> mapper.map(podatnik, PodatnikDTO.class))
                .collect(Collectors.toList());
    }


    @PostMapping
    public PodatnikDTO zapisz(Podatnik podatnik) {
        return mapper.map(dao.save(mapper.map(podatnik, Podatnik.class)), PodatnikDTO.class);

    }

    @DeleteMapping
    public PodatnikDTO usun (Long pesel) {
        Podatnik podatnik = dao.findById(pesel).orElse(null);
        dao.deleteById(pesel);
        return mapper.map(podatnik, PodatnikDTO.class);
    }

    @GetMapping("/faktury")
    public Page<FakturaDTO> faktury (@RequestParam Long peselPodatnika,
                                     @RequestParam int strona,
                                     @RequestParam int rozmiar) {
        return fakturaDAO.findAllByPodatnikPesel(peselPodatnika, PageRequest.of(strona, rozmiar))
                .map(faktura -> mapper.map(faktura, FakturaDTO.class));
    }
}
