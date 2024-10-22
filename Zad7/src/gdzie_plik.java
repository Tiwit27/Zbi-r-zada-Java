import java.io.File;

public class gdzie_plik
{
    public static void main(String[] args) {
        File file = new File("plik.txt");
        boolean exists = file.exists();
        System.out.println("Czy istnieją: " + exists);
        String absolutePath = file.getAbsolutePath();
        System.out.println("Ten plik jest w: " + absolutePath);
    }
}
