import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = myObj.nextInt();
        int pierwsza = 1;
        for (int i = liczba - 1; i > 1; i--) {
            if(liczba % i == 0)
            {
                System.out.println("Liczba nie jest pierwsza ponieważ jest podzielna przez " + i);
                pierwsza = 0;
                break;
            }
        }
        if(pierwsza == 1)
        {
            System.out.println("Liczba jest liczbą pierwszą");
        }
    }
}