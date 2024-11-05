import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        char[] zbior = {'a', 'f', 'z', 'b', 'd', 't'};
        sort(zbior);
        System.out.println(Arrays.toString(zbior));
    }
    public static char[] sort(char[] tab)
    {
        int size = tab.length;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - i - 1; j++)
            {
                if(tab[j] > tab[j+1])
                {
                    char temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;
    }

}