public class Main
{
    public static void main(String[] args)
    {
        Dodawanie dodawanie = new Dodawanie();
        System.out.println(dodawanie.dodaj(2,50000000000000L));
        System.out.println(dodawanie.dodaj(2,500000));
        System.out.println(dodawanie.dodaj(2,500.5));
    }
}