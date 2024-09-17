import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int l1 = myObj.nextInt();
        System.out.println("Podaj liczbę:");
        int l2 = myObj.nextInt();
        System.out.println("Podaj liczbę:");
        int l3 = myObj.nextInt();
        int[] tablica = {l1,l2,l3};
        sortownie(tablica);
        if(tablica[0] * tablica[0] + tablica[1] * tablica[1] == tablica[2] * tablica[2])
        {
            System.out.println("Te liczby tworzą trójkę pitagorejską");
        }
        else
        {
            System.out.println("Te liczby nie tworzą trójki pitagorejskiej");
        }
    }
    static void sortownie(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {

            for (int j = i + 1; j < tablica.length; j++) {

                int liczbaA = tablica[i];
                int liczbaB = tablica[j];

                if (liczbaA > liczbaB) {
                    tablica[i] = liczbaB;
                    tablica[j] = liczbaA;
                }
            }
        }
    }
}