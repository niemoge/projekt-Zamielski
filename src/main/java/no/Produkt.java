package no;


public class Produkt {
    /**
     * @param nazwa Nazwa produktu
     * @param  cena produktu w zł
     * @param dostepnaIlosc Ilosc dostepnych produktow.
     */
    private String nazwa;
    private double cena;
    private int dostepnaIlosc;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getDostepnaIlosc() {
        return dostepnaIlosc;
    }

    public void setDostepnaIlosc(int dostepnaIlosc) {
        this.dostepnaIlosc = dostepnaIlosc;
    }


    public void wyswietlInformacje() {
        System.out.println("Produkt: " + nazwa);
        System.out.println("Cena: " + cena + " zł");
        System.out.println("Dostępna ilość: " + dostepnaIlosc);
    }
}

