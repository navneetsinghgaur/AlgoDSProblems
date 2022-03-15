package recursion;

import java.util.*;

public class GenerateAllString_Karry {
    public static int [] A;
    public static void main(String[] args) {
        A = new int[4];
        GenerateAllString(4, 0, 3);
    }

    public static void GenerateAllString(int size, int index, int k) {

        if (index+1 > size )
        {
            System.out.println(Arrays.toString(A));
            return;
        }

        for (int i = 0; i < k; i++) 
        {
            A[index] = i;
            GenerateAllString(size, index+1, k);
        }

        return;
    }    
}
