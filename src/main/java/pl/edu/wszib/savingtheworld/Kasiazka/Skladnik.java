package pl.edu.wszib.savingtheworld.Kasiazka;

import javax.persistence.*;

@Entity
@Table
public class Skladnik {

    @Id
    @GeneratedValue
    Long id;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    TypSkladnika typSkladnika;
    @Column(nullable = false)
    int ilosc;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn (name = "przepis_id")
    Przepis przepis;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }
}
