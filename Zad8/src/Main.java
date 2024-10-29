import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        File html = new File("index.html");
        Scanner scanner = new Scanner(file);
        PrintWriter writer = new PrintWriter(html);
        writer.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<table>");
        while(scanner.hasNext())
        {
            String string = scanner.nextLine();
            String[] splitedStrings = string.split(" ");
            writer.println("<tr style='border: black solid 2px'>");
            for (int i = 0; i < splitedStrings.length; i++) {
                writer.println("<td style='border: black solid 2px'>" + splitedStrings[i] + "</td>");
            }
            writer.println("</tr>");
        }
        writer.println("</table>\n" +
                "</body>\n" +
                "</html>");
        writer.close();
    }
}