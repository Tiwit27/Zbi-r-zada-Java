import java.util.ArrayList;

public class Liczby
{
    public static int Losuj()
    {
        return (int)(Math.random() * 6) + 1;
    }
    public static int LiczPunkty(int[] tab)
    {
        ArrayList<Integer> distinct = new ArrayList<>();
        ArrayList<Integer> dodane = new ArrayList<>();
        int wynik = 0;
        for(int liczba : tab)
        {
            if(!distinct.contains(liczba))
            {
                distinct.add(liczba);
            }
            else
            {
                wynik += liczba;
                if(!dodane.contains(liczba))
                {
                    dodane.add(liczba);
                    wynik += liczba;
                }
            }
        }
        return wynik;
    }
}
