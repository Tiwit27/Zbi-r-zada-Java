import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String kategoria;
        do {
            System.out.println("Podaj swoją kategorie zaszeregowania wg wzoru \n" +
                    "(A 15zł/h \n" +
                    "B 25zł/h \n" +
                    "C 30zł/h \n" +
                    "D 35zł/h) :");
            kategoria = myObj.nextLine();
        }while (!Objects.equals(kategoria, "A") && !Objects.equals(kategoria, "B") && !Objects.equals(kategoria, "C") && !Objects.equals(kategoria, "D"));
        int placa = 0;
        switch (kategoria)
        {
            case "A":
                placa = 15;
                break;
            case "B":
                placa = 25;
                break;
            case "C":
                placa = 30;
                break;
            case "D":
                placa = 35;
                break;
        }
        System.out.println("Podaj ilośc przepracowanych godzin:");
        int przepracowaneGodziny = myObj.nextInt();
        int wyplataBrutto = 0;
        if(przepracowaneGodziny > 40)
        {
            for(int i = 1; i < 41; i++)
            {
                wyplataBrutto += placa;
            }
            for(int i = przepracowaneGodziny; i >= 41; i--)
            {
                wyplataBrutto += placa * 2;
            }
        }
        else
        {
            for(int i = 0; i < przepracowaneGodziny; i++)
            {
                wyplataBrutto += placa;
            }
        }
        double wyplataNetto;
        if(wyplataBrutto <= 700)
        {
            wyplataNetto = wyplataBrutto*0.85;
        }
        else if (wyplataBrutto > 700 && wyplataBrutto <= 1200)
        {
            wyplataNetto = wyplataBrutto*0.80;
        }
        else
        {
            wyplataNetto = wyplataBrutto*0.75;
        }
        System.out.println("Końcowa wypłata pracownika: " + wyplataNetto);
    }
}