import java.io.File;

public class spr_pliku
{
    public static void main(String[] args) {
        File file = new File("plik.txt");
        boolean exists = file.exists();
        System.out.println("Czy istnieje: " + exists);
    }
}
