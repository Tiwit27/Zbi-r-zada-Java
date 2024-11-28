public class Main
{
    public static void main(String[] args)
    {
        int liczba = 100;
        System.out.println("Liczba przed konwersją: " + liczba);
        konwertuj(liczba);
        System.out.println("Liczba po konwersji: " + liczba);

        Liczba liczba2 = new Liczba();
        liczba2.liczba = 100;
        System.out.println("Obiekt liczby przed konwersją: " + liczba2.liczba);
        konwertuj(liczba2);
        System.out.println("Obiekt liczby po konwersji: " + liczba2.liczba);
    }
    public static void konwertuj(int liczba)
    {
        liczba = -5;
    }
    public static void konwertuj(Liczba liczba2)
    {
        liczba2.liczba = -5;
    }
}