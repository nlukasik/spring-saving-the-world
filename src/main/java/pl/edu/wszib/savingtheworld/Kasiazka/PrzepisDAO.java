package pl.edu.wszib.savingtheworld.Kasiazka;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrzepisDAO extends OurCrudRepository<Przepis, Long> {



}
