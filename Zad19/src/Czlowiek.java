public class Czlowiek
{
    String imie;
    static int liczebnosc = 0;
    Czlowiek()
    {
        liczebnosc++;
    }
    Czlowiek(String imie)
    {
        this.imie = imie;
    }
}
