
package pl.edu.wszib.savingtheworld.dao;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long id;

    double kwota;
    String tytul;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "podatnik_id", nullable =false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    Podatnik podatnik;

    public Faktura () {

    }

    public Faktura(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public void setPodatnik(Podatnik podatnik) {
        this.podatnik = podatnik;
    }

    public Podatnik getPodatnik() {
        return podatnik;
    }

    public Long getId() {
        return id;
    }

    public double getKwota() {
        return kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}

