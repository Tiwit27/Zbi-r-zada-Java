public class Osoba
{
    public static void main(String[] args)
    {
        Adres adres = new Adres("Skrbeńsko", "44-341", "Piotrowicka", 67);
        Osoba osoba1 = new Osoba("Rafał", "Łojek", 2007, adres);
        System.out.println("Osoba1: \n" + osoba1.toString() + "\n");
        Osoba osoba2 = new Osoba("Jan", "Nowak", 1978, "Rybnik", "44-225", "Żorska", 23);
        System.out.println("Osoba2: \n" + osoba2.toString());
    }


    String imie;
    String nazwisko;
    final int rokUrodzenia;
    Adres adres;

    public Osoba(String imie, String nazwisko, int rokUrodzenia, Adres adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;
    }
    public Osoba(String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int numerDomu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, numerDomu);
    }
    public String toString()
    {
        return "Imie: " + imie + "\nNazwisko: " + nazwisko + "\nRok Urodzenia: " + rokUrodzenia + "\n" + adres.toString();
    }
}
