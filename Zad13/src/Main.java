import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("owce.txt");
        //Scanner scanner = new Scanner(file);
        //PrintWriter printer = new PrintWriter(file);
        int[] numbers = new int[100000];
        int[] owce = new int[10000];
        for(int i = 1; i < 100000; i++)
        {
            numbers[i - 1] = i;
        }
        for(int i = 0; i < 10000; i++)
        {
            int x = 0;
            do
            {
                x = (int)(Math.random() * 100000);
            }while(numbers[x] < 0);
            owce[i] = numbers[x];
            numbers[x] = -1;
        }
        Zespol[] zespoly = new Zespol[10];
        for(int i = 0; i < 10; i++)
        {
            zespoly[i] = new Zespol();
        }
        for(int i = 0, zespol = 0; i < 10000; i++)
        {
            zespoly[zespol].IdOwiec.add(owce[i]);
            zespol++;
            if(zespol == 10)
            {
                zespol = 0;
            }
        }
        
    }
}