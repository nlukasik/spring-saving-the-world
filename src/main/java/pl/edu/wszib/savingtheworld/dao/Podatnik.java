package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table

public class Podatnik {


    @Id
    @GeneratedValue
    Long pesel;

    @Column (nullable = false)
    public String imie;

    @Column (nullable = false)
    public String nazwisko;

    @OneToMany()
    List<Faktura> faktury;

    public Podatnik () {

    }

    public List<Faktura> getFaktury() {
        return faktury;
    }

    public void setFaktury(List<Faktura> faktury) {
        this.faktury = faktury;
    }

    public Podatnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

/*    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }*/

    public Long getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
