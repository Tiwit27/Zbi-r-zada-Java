import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = myObj.nextInt();
        for (int i = 1; i < liczba; i++) {
            if(i%7 == 0)
            {
                System.out.println(i + ", ");
            }
        }
    }
}