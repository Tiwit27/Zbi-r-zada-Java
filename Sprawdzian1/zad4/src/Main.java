import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = myObj.nextInt();
        int wynik = 0;
        for (int i = 1;i <= liczba ; i++) {
            if(i % 2 == 0)
            {
                wynik += i;
            }
        }
        System.out.println("Wynik: " + wynik);
    }
}