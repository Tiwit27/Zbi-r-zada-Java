import java.util.List;

public class MergeSort
{
    static void merge(List<Integer> array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++)
        {
            L[i] = array.get(p + i);
        }
        for (int j = 0; j < n2; j++)
        {
            M[j] = array.get(q + 1 + j);
        }
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2)
        {
            if (L[i] <= M[j])
            {
                array.set(k, L[i]);
                i++;
            } else
            {
                array.set(k, M[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            array.set(k, L[i]);
            i++;
            k++;
        }
        while (j < n2) {
            array.set(k, M[j]);
            j++;
            k++;
        }
    }
    static void mergeSort(List<Integer> array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
}
