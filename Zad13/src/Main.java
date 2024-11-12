import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        File file = new File("wynik.txt");
        FileWriter writer = new FileWriter(file);
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
        for(int i = 0; i < 10; i++)
        {
            MergeSort.mergeSort(zespoly[i].IdOwiec,0,zespoly[i].IdOwiec.size() - 1);
        }
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 1000; j++)
            {
                writer.write(zespoly[i].IdOwiec.get(j).toString()  + "\n");
            }
            writer.write("\n");
        }
        writer.close();
    }
}