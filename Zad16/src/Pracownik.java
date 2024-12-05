import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
         int i = 0;
         while (odczyt.hasNextLine() || i >= 100)
         {
             String linia = odczyt.nextLine();
             String[] array = linia.split("\\W+");
             pracownicy[i] = new Pracownik(array[0], array[1], Integer.parseInt(array[2]),array[3].charAt(0), Integer.parseInt(array[4]));
             i++;
         }
         return i;
     }
     public static double srednieZarobki(Pracownik[] pracownicy, int numerDzialu, char plec)
     {
         ArrayList<Integer> zarobki = new ArrayList<Integer>();
         for(Pracownik pracownik : pracownicy)
         {
             if(pracownik != null)
             {
                 if(pracownik.dzial == numerDzialu && pracownik.plec == plec)
                 {
                     zarobki.add(pracownik.placa);
                 }
             }
             else
             {
                 break;
             }
         }
         int sumaZarobkow = 0;
         for(int zarobek : zarobki)
         {
             sumaZarobkow += zarobek;
         }
         double srednia = (double) sumaZarobkow / zarobki.size();
         return srednia;
     }
     public static void zapiszDoPliku(String nazwaPliku, Pracownik[] pracownicy) throws FileNotFoundException {
         PrintWriter zapis = new PrintWriter(nazwaPliku + ".txt");
         for(Pracownik pracownik : pracownicy)
         {
             if(pracownik != null)
             {
                 String linia = pracownik.imie + " " + pracownik.nazwisko + " " + pracownik.placa + " " + pracownik.plec + " " + pracownik.dzial;
                 zapis.println(linia);
             }
             else
             {
                 break;
             }
         }
         zapis.close();
     }
     public static void odczytZPliku(String nazwaPliku, Pracownik[] pracownicy) throws FileNotFoundException {
         Scanner odczyt = new Scanner(new File(nazwaPliku + ".txt"));
         int i = 0;
         while (odczyt.hasNextLine() || i >= 100)
         {
             String linia = odczyt.nextLine();
             String[] array = linia.split("\\W+");
             pracownicy[i] = new Pracownik(array[0], array[1], Integer.parseInt(array[2]),array[3].charAt(0), Integer.parseInt(array[4]));
             i++;
         }
     }
}
