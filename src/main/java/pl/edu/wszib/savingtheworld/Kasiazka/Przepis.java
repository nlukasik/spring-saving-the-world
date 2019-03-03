package pl.edu.wszib.savingtheworld.Kasiazka;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Przepis {

    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String tytul;
    @OneToMany (mappedBy = "przepis", fetch = FetchType.EAGER)
    List<Skladnik> skladniki;

    @ManyToOne
    @JoinColumn (name = "ksiazka_id")
    KsiazkaKucharska ksiazkaKucharska;

    /*public Przepis () {

    }

    public Przepis (String tytul ) {
        this.tytul=tytul;
    }

    public List<Skladnik> getSkladniki() {
        return skladniki;
    }*/


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setSkladniki(List<Skladnik> skladniki) {
        this.skladniki = skladniki;
    }

    public KsiazkaKucharska getKsiazkaKucharska() {
        return ksiazkaKucharska;
    }

    public void setKsiazkaKucharska(KsiazkaKucharska ksiazkaKucharska) {
        this.ksiazkaKucharska = ksiazkaKucharska;
    }
}
