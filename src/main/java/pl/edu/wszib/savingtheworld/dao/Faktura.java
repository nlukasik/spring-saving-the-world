package pl.edu.wszib.savingtheworld.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long id;

    double kwota;
    String tytul;

    public Faktura () {

    }

    public Faktura(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
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
