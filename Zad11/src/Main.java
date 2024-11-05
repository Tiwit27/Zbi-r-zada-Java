import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] tab = {8500, 6400, 2800, 3500, 12870, 3300, 7020, 3000, 8100};
        sort(tab);
        System.out.println(tab[(int)tab.length/2]);
    }
    public static int[] sort(int[] tab)
    {
        int size = tab.length;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - i - 1; j++)
            {
                if(tab[j] > tab[j+1])
                {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;
    }
}