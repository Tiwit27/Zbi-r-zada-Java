public class Dodawanie
{
    public int dodaj(int a, int b)
    {
        System.out.println("Użyto przeciążenia z int");
        return a + b;
    }
    public double dodaj(double a, double b)
    {
        System.out.println("Użyto przeciążenia z double");
        return a + b;
    }
    public long dodaj(long a, long b)
    {
        System.out.println("Użyto przeciążenia z long");
        return a + b;
    }
}
