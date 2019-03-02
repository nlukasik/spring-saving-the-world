package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;

@Entity
@Table

public class Podatnik {


    @Id
    @GeneratedValue
    Long pesel;

    @Column (nullable = false)
    String imie;

    @Column (nullable = false)
    String nazwisko;

    public Podatnik () {

    }

    public Podatnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

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
