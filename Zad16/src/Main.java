import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Pracownik[] pracownicy = new Pracownik[100];
        Pracownik.wczytajZPlikuTekstowego("pracownicy", pracownicy);
        System.out.println(Pracownik.srednieZarobki(pracownicy,3,'K'));
        Pracownik.zapiszDoPliku("zapis", pracownicy);
    }
}