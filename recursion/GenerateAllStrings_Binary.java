package recursion;

import java.util.Arrays;

public class GenerateAllStrings_Binary {
    
    public static int [] A;
    public static void main(String[] args) {
        A = new int[4];
        GenerateAllString(4, 0);
    }

    public static void GenerateAllString(int size, int index) {

        if (index+1 > size )
        {
            System.out.println(Arrays.toString(A));
            return;
        }

        A[index] = 0;
        GenerateAllString(size, index+1);
        A[index] = 1;
        GenerateAllString(size, index+1);

    }    
}