import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        int liczbaA = myObj.nextInt();
        System.out.println("Podaj liczbę b:");
        int liczbaB = myObj.nextInt();
        System.out.println(liczbaA + liczbaB);
    }
}