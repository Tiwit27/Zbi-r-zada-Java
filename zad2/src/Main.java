import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Podaj liczbę a:");
            int liczbaA = myObj.nextInt();
            System.out.println("Podaj liczbę b:");
            int liczbaB = myObj.nextInt();
            if(liczbaA % 2 == 0 && liczbaB % 2 == 0)
            {
                int wynik = liczbaA + liczbaB;
                System.out.println("Wynik:" + wynik);
            }
            else
            {
                System.out.println("Jedna lub obie liczby są nieparzyste");
            }
    }
}