import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Emerytura("pracownicy1.txt");
    }
    public static void Emerytura(String nazwaPliku) throws FileNotFoundException {
        File file = new File(nazwaPliku);
        Scanner scanner = new Scanner(file);
        File men = new File("mezczyzni.txt");
        File women = new File("kobiety.txt");
        PrintWriter writerM = new PrintWriter(men);
        PrintWriter writerW = new PrintWriter(women);
        while(scanner.hasNext())
        {
            String line = scanner.nextLine();
            String[] splitedLine  = line.split(" ");
            if(splitedLine[2].equals("M"))
            {
                writerM.println(splitedLine[1] + " " + splitedLine[0] + " " + (65 - Integer.parseInt(splitedLine[3])));
            }
            else
            {
                writerW.println(splitedLine[1] + " " + splitedLine[0] + " " + (60 - Integer.parseInt(splitedLine[3])));
            }
        }
        writerW.close();
        writerM.close();
    }
}