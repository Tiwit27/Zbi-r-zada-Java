import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pracownik
{
     String imie;
     String nazwisko;
     int placa;
     char plec;
     int dzial;
     public Pracownik(String imie, String nazwisko, int placa, char plec, int dzial)
     {
         this.imie = imie;
         this.nazwisko = nazwisko;
         this.placa = placa;
         this.plec = plec;
         this.dzial = dzial;
     }
     public static int wczytajZPlikuTekstowego(String nazwaPliku, Pracownik[] pracownicy) throws FileNotFoundException {
         Scanner odczyt = new Scanner(new File(nazwaPliku + ".txt"));
         while (odczyt.hasNextLine())
         {
             String linia = odczyt.nextLine();
             String[] array = linia.split("\\W+");

         }

         return 0;
     }
}
