import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        boolean kontynuowac = true;
        Samochod[] samochody =
                {
                        new Samochod("Renault", 1.6, 2016, "SWD 12345", "Nowak"),
                        new Samochod("Mercedes", 1.4, 2012, "SJZ 12887", "Kowalski"),
                        new Samochod("Audi", 2.0, 2011, "SWD 54321", "Marczak"),
                        new Samochod("Mustang", 2.4, 2021, "SR 12345", "Nowakowski"),
                        new Samochod("Peugeot", 1.6, 2013, "SJZ 33221", "Kowal")
                };
        while (kontynuowac) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("MENU:");
            System.out.println("1. Wyswietl informacje o samochodzie o podanej rejestracji");
            System.out.println("2. Wyswietl informacje o wszytskich samochodach");
            System.out.println("3. Zmiana własciciela pojazdu o podanej rejestracji");
            System.out.println("4. Wyświetl informacje o pojazdach wyprodukowanych przed podanym rokiem");
            System.out.println("5. Posortuj pojazdy ze względu na pojemność silnika");
            String wybor = scanner.nextLine();
            switch (wybor) {
                case "1":
                    System.out.print("Podaj rejestrację: ");
                    String rejestracja = scanner.nextLine();
                    Wybor1(samochody, rejestracja);
                    break;
                case "2":
                    for(Samochod samochod : samochody)
                    {
                        samochod.WyswietlInformacjeOSamochodzie();
                    }
                    break;
                case "3":
                    System.out.print("Podaj rejestrację: ");
                    String rejestracja3 = scanner.nextLine();
                    Wybor3(samochody, rejestracja3);
                    break;
                case "4":
                    System.out.print("Podaj rok produkcji: ");
                    int rok = Integer.parseInt(scanner.nextLine());
                    Wybor4(samochody, rok);
                    break;
                case "5":
                    Wybor5(samochody);
                    break;
                default:
                    kontynuowac = false;
                    break;
            }
        }

    }
    public static void Wybor1(Samochod[] samochody, String rejestracja)
    {
        for(Samochod samochod : samochody)
        {
            if(samochod.numerRejestracyjny.equals(rejestracja))
            {
                samochod.WyswietlInformacjeOSamochodzie();
                break;
            }
        }
    }
    public static void Wybor3(Samochod[] samochody, String rejestracja)
    {
        for(Samochod samochod : samochody)
        {
            if(samochod.numerRejestracyjny.equals(rejestracja))
            {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Podaj nazwisko nowego właściciela: ");
                samochod.nazwiskoWlasciciela = scanner.nextLine();
                samochod.WyswietlInformacjeOSamochodzie();
            }
        }
    }
    public static void Wybor4(Samochod[] samochody, int rokProdukcji)
    {
        for(Samochod samochod : samochody)
        {
            if(samochod.rokProdukcji < rokProdukcji)
            {
                samochod.WyswietlInformacjeOSamochodzie();
            }
        }
    }
    public static void Wybor5(Samochod[] samochody)
    {
        for(int i = 0; i < samochody.length - 1; i++) {
            for (int j = 0; j < samochody.length - i - 1; j++) {
                if (samochody[j].rokProdukcji > samochody[j + 1].rokProdukcji) {
                    int temp = samochody[j].rokProdukcji;
                    samochody[j].rokProdukcji = samochody[j + 1].rokProdukcji;
                    samochody[j + 1].rokProdukcji = temp;
                }
            }
        }
        for(Samochod samochod : samochody)
        {
            samochod.WyswietlInformacjeOSamochodzie();
        }
    }
}