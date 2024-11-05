import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        do
        {
            System.out.println("Podaj numer miesiąca: ");
            int liczba = myObj.nextInt();
            if(liczba < 1 || liczba > 12)
            {
                i++;
            }
            else
            {
                System.out.println("Poprawny miesiąc!");
                break;
            }
        }while (i < 3);
        if(i == 3)
        {
            System.out.println("3 razy podałeś zły miesiąc");
        }
    }
}