import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dodaj_text_petla
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
        {
            String linia = scanner.nextLine();
            System.out.println(linia);
        }
    }
}