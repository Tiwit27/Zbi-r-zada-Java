public class Samochod
{
    String markaSamochodu;
    double pojemnoscSilnika;
    int rokProdukcji;
    String numerRejestracyjny;
    String nazwiskoWlasciciela;

    Samochod(String markaSamochodu, double pojemnoscSilnika, int rokProdukcji, String numerRejestracyjny, String nazwiskoWlasciciela)
    {
        this.markaSamochodu = markaSamochodu;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rokProdukcji = rokProdukcji;
        this.numerRejestracyjny = numerRejestracyjny;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public void WyswietlInformacjeOSamochodzie()
    {
        System.out.println("Informacje o tym samochodzie: \n" +
                "Marka: " + markaSamochodu + "\n" +
                "Pojemność Silnika: " + pojemnoscSilnika + "\n" +
                "Rok Produkcji: " +rokProdukcji + "\n" +
                "Numer Rejestracyjny: " + numerRejestracyjny + "\n" +
                "Nazwisko Właściciela: " + nazwiskoWlasciciela + "\n");
    }
}
