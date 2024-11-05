import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        sumujIZapisz("liczby.txt");
    }
    public static void sumujIZapisz(String nazwaPliku) throws FileNotFoundException {
        File file = new File(nazwaPliku);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.hasNext());
        PrintWriter writer = new PrintWriter(file);
        List<Integer> values = new ArrayList<Integer>();
        int result = 0;
        while(scanner.hasNext())
        {
            int number = Integer.parseInt(scanner.nextLine());
            values.add(number);
            result+=number;
        }
        for (int i = 0; i < values.size(); i++)
        {
            writer.println(values.get(i));
        }
        writer.println(result + 1);
        writer.close();
    }
}