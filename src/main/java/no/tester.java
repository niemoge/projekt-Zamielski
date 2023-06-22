package no;

public class tester {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik();
        pracownik.setImie("Jan");
        pracownik.setNazwisko("Kowalski");
        pracownik.setWiek(30);


        pracownik.przedstawSie();


        Produkt produkt = new Produkt();
        produkt.setNazwa("Telewizor");
        produkt.setCena(1999.99);
        produkt.setDostepnaIlosc(10);


        produkt.wyswietlInformacje();


        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setNumer(1);
        zamowienie.setSprzedawca(pracownik);
        zamowienie.setProdukt(produkt);


        zamowienie.wyswietlSzczegoly();
    }
}