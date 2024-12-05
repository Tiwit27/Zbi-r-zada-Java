import java.io.*;
import java.util.Scanner;

public class Enigma
{
    public static int LosujSzyfr(int liczba)
    {
        return 0;
    }
    public static void Szyfruj() throws IOException {
        File zaszyfrowany = new File("zaszyfrowany.txt");
        File odszyfrowany = new File("odszyfrowany.txt");
        FileWriter writer = new FileWriter(zaszyfrowany);
        Scanner reader = new Scanner(odszyfrowany);
        while(reader.hasNextLine())
        {
            String odszyfrowanaLinia = reader.nextLine();
            StringBuilder zaszyfrowanaLinia = new StringBuilder();
            for(int i = 0; i < odszyfrowanaLinia.length(); i++)
            {
                zaszyfrowanaLinia.append((char)(odszyfrowanaLinia.charAt(i) - 5));
            }
            writer.write(zaszyfrowanaLinia.toString() + "\n");
            System.out.println(zaszyfrowanaLinia);
        }
        writer.close();
        System.out.println("Zaszyfrowano w pliku 'zaszyfrowany.txt'");
    }
    public static void Odszyfruj() throws IOException {
        File zaszyfrowany = new File("zaszyfrowany.txt");
        File odszyfrowany = new File("NOWYodszyfrowany.txt");
        FileWriter writer = new FileWriter(odszyfrowany);
        Scanner reader = new Scanner(zaszyfrowany);
        while(reader.hasNextLine())
        {
            String zaszyfrowanaLinia = reader.nextLine();
            StringBuilder odszyfrowanaLinia = new StringBuilder();
            for(int i = 0; i < zaszyfrowanaLinia.length(); i++)
            {
                odszyfrowanaLinia.append((char)(zaszyfrowanaLinia.charAt(i) + 5));
            }
            writer.write(odszyfrowanaLinia.toString() + "\n");
            System.out.println(odszyfrowanaLinia);
        }
        writer.close();
    }
}
