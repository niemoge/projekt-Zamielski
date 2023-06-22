package org.example;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek >= 0) {
            this.wiek = wiek;
        } else {
            System.out.println("Wiek nie może być ujemny.");
        }
    }

    public void przedstawSie() {
        System.out.println("Cześć, jestem " + imie + " " + nazwisko + ".");
    }
}

