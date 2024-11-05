import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj ocenę:");
        int ocena = myObj.nextInt();
        switch (ocena)
        {
            case 2:
                System.out.println("Niedostateczny");
                break;
            case 3:
                System.out.println("Dostateczny");
                break;
            case 4:
                System.out.println("Dobry");
                break;
            case 5:
                System.out.println("Bardzo Dobry");
                break;
            case 6:
                System.out.println("Celujący");
                break;
            default:
                System.out.println("Nie ma takiej oceny");
                break;
        }
    }
}