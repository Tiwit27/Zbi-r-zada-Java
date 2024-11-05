import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = myObj.nextInt();
        if(liczba % 2 == 0)
        {
            System.out.println(liczba + " jest parzysta");
        }
        else
        {
            System.out.println(liczba + " jest nie parzysta");
        }
    }
}