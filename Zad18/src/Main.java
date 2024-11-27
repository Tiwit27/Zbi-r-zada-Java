import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[] PESEL = new int[11];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PESEL:");
        char[] pesel = scanner.nextLine().toCharArray();
        
        for(int i = 0; i < PESEL.length; i++)
        {
            PESEL[i] = pesel[i] - 48;
        }
        System.out.println(PESEL[0]);
    }
}