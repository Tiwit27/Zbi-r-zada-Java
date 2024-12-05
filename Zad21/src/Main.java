import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.println("1. Zaszyfruj");
        System.out.println("2. Odszyfruj");
        System.out.print("Wybierz: ");
        switch (scanner.nextInt())
        {
            case 1:
                Enigma.Szyfruj();
                break;
            case 2:
                Enigma.Odszyfruj();
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
    }
}