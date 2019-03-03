package pl.edu.wszib.savingtheworld.Kasiazka;


import javax.persistence.*;

@Entity
@Table
public class TypSkladnika {

    @Id
    @GeneratedValue
    Long id;
    @Column(unique = true, nullable = false)
    String nazwa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
