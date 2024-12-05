public class Adres
{
    String miejscowosc;
    String kodPocztowy;
    String nazwaUlicy;
    int numerDomu;

    public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int numerDomu)
    {
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.nazwaUlicy = nazwaUlicy;
        this.numerDomu = numerDomu;
    }
    public String toString()
    {
        return "Miejscowość: " + miejscowosc + "\nKod Pocztowy: " + kodPocztowy + "\nNazwa Ulicy: " + nazwaUlicy + "\nNumer Domu: " + numerDomu;
    }
}
