import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Firma firma1 = new Firma();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            Pracownik edited = new Pracownik();
            System.out.print("Podaj imię pracownika: ");
            edited.imie = scanner.nextLine();
            System.out.print("Podaj nazwisko pracownika: ");
            edited.nazwisko = scanner.nextLine();
            System.out.print("Podaj wiek pracownika: ");
            edited.wiek = Integer.parseInt(scanner.nextLine());
            firma1.pracownicy.add(edited);
        }
        System.out.println("Firma zatrudnia podanych pracowników: ");
        for(Pracownik pracownik : firma1.pracownicy)
        {
            System.out.println(pracownik.imie + " " + pracownik.nazwisko + " wiek: " + pracownik.wiek);
        }
    }
}