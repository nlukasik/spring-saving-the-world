package pl.edu.wszib.savingtheworld.dto;

public class FakturaDTO {

    double kwota;
    String tytul;

    public FakturaDTO(double kwota, String tytul) {
        this.kwota = kwota;
        this.tytul = tytul;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
