import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int liczbaKosci;
        while (true) {
            try {
                do {
                    System.out.print("Podaj liczbę kości do wyrzucenia. Liczba powinna być z przedziału <3,10>: ");
                    liczbaKosci = scanner.nextInt();
                } while (liczbaKosci < 3 || liczbaKosci > 10);
                break;
            } catch (Exception e) {
                System.out.println("Błąd");
            }
        }
        while(true) {
            String wybor;
            int[] wylosowaneLiczby = new int[liczbaKosci];
            for (int i = 0; i < wylosowaneLiczby.length; i++) {
                wylosowaneLiczby[i] = Liczby.Losuj();
                System.out.println("Kostka " + i + ": " + wylosowaneLiczby[i]);
            }
            System.out.println("Liczba uzyskanych punktów: " + Liczby.LiczPunkty(wylosowaneLiczby));
            do
            {
                System.out.println("Jeszcze raz? (t/n)");
                wybor = scanner.nextLine();
            }while (!wybor.equals("t") && !wybor.equals("n"));
            if(wybor.equals("n"))
            {
                break;
            }
        }
    }
}