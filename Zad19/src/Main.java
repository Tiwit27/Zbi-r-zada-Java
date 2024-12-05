public class Main
{
    public static void main(String[] args)
    {
        Czlowiek marcin = new Czlowiek("Marcin");
        System.out.println(marcin.imie);
        System.out.println(Czlowiek.liczebnosc);

        Czlowiek zosia = new Czlowiek();
        zosia.imie = "Zosia";
        System.out.println(zosia.imie);
        System.out.println(Czlowiek.liczebnosc);
    }
}