package recursion;

import java.util.Arrays;

public class GenerateAllPermutationGivenArray {

    static int [] perms;
    public static void main(String[] args) {
        
        int [] A = new int [] {1, 2, 3} ;
        perms = A.clone();
        GenerateAllPerms(A, 0, A.length);
    }

    public static void GenerateAllPerms(int [] A, int i, int size) 
    {
        if (i == size-1)
        {
            System.out.println(Arrays.toString(A));
        }

        for (int j = i ; j < size; j++)
        {
            swap(A, i, j);
            GenerateAllPerms(A, i+1, size);
            swap(A, i, j);
        }   
    }

    static int[] swap (int []A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        return A;
    }
    
}
