package sorting;

import java.util.Arrays;

public class SortListContaining3UniqueNums { 
    public static void main(String[] args) {
        
        int [] A = {1, 3, 3, 2, 1, 3, 2, 1, 3, 3};
        A = sortThreeUnique(A);

        System.out.println(Arrays.toString(A));
    }
    
    public static int[] sortThreeUnique(int []A)
    {
        int len = A.length, i = 0, j = 0, k = len - 1;

        while (j < k)
        {
            if (A[j] == 1) 
            {
                A = swap(A, i, j);
                i++;
                j++;
            }

            if(A[j] == 2)
            {
                j++;
            }

            if(A[j] == 3)
            {
                A = swap(A, j, k);
                k--;
            }
        }
        return A;
    }
 
    static int[] swap (int []A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        return A;
    }
}
