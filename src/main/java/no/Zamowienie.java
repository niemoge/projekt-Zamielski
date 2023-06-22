package no;


import no.Produkt;
import no.Pracownik;

public class Zamowienie {
    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public Pracownik getSprzedawca() {
        return sprzedawca;
    }

    public void setSprzedawca(Pracownik sprzedawca) {
        this.sprzedawca = sprzedawca;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    private int numer;
    private Pracownik sprzedawca;
    private Produkt produkt;


    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie nr " + numer);
        sprzedawca.przedstawSie();
        produkt.wyswietlInformacje();
    }
}
