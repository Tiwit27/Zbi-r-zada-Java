import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dodaj_text
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner scanner = new Scanner(file);
        String linia1 = scanner.nextLine();
        String linia2 = scanner.nextLine();

        System.out.println(linia1);
        System.out.println(linia2);
    }
}
