import java.io.*;
import java.util.Scanner;

public class Enigma
{
    public static int LosujSzyfr()
    {
        return (int)(Math.random() * 100) + 1;
    }
    public static void Szyfruj(int liczba) throws IOException {
        File zaszyfrowany = new File("zaszyfrowany.txt");
        File odszyfrowany = new File("odszyfrowany.txt");
        FileWriter writer = new FileWriter(zaszyfrowany);
        Scanner reader = new Scanner(odszyfrowany);
        while(reader.hasNextLine())
        {
            String odszyfrowanaLinia = reader.nextLine();
            StringBuilder zaszyfrowanaLinia = new StringBuilder();
            zaszyfrowanaLinia.append((char)liczba);
            for(int i = 0; i < odszyfrowanaLinia.length(); i++)
            {
                zaszyfrowanaLinia.append((char)(odszyfrowanaLinia.charAt(i) - liczba));
            }
            writer.write(zaszyfrowanaLinia + "\n");
        }
        writer.close();
        System.out.println("Zaszyfrowano w pliku 'zaszyfrowany.txt'");
    }
    public static void Odszyfruj() throws IOException {
        File zaszyfrowany = new File("zaszyfrowany.txt");
        File odszyfrowany = new File("NOWYodszyfrowany.txt");
        FileWriter writer = new FileWriter(odszyfrowany);
        Scanner reader = new Scanner(zaszyfrowany);
        int liczba;
        while(reader.hasNextLine())
        {
            String zaszyfrowanaLinia = reader.nextLine();
            StringBuilder odszyfrowanaLinia = new StringBuilder();
            liczba = zaszyfrowanaLinia.charAt(0);
            zaszyfrowanaLinia = zaszyfrowanaLinia.substring(1);
            for(int i = 0; i < zaszyfrowanaLinia.length(); i++)
            {
                odszyfrowanaLinia.append((char)(zaszyfrowanaLinia.charAt(i) +liczba));
            }
            writer.write(odszyfrowanaLinia + "\n");
        }
        writer.close();
    }
}
