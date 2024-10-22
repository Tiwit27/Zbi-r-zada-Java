import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class dodanie_tekstu
{
    public static void main(String[] args) throws IOException {
        File file = new File("plik4.txt");
        boolean succes = file.createNewFile();
        System.out.println("Czy udało się utworzyć " + succes);

        PrintWriter writer = new PrintWriter(file);
        writer.println("Ala ma kota");
        writer.println("Kot ma Ale");
        writer.close();
    }
}
