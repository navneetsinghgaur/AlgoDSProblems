package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        
        int A [] = new int [] {1, 2, 3, 4};
        A = product(A);

        System.out.println(Arrays.toString(A));
    }

    static int [] product(int [] A)
    {
        int [] prod = new int[A.length];
        int [] right = new int[A.length];

        //compute right array
        int result = 1;

        for (int i = A.length - 1; i >= 0; i --)
        {
            right[i] = result;
            result *= A[i];
        }
        
        result = 1;
        prod[0] = right[0];
        
        for (int i = 1; i < A.length; i ++)
        {
            result *= A[i-1];
            prod[i] = result * right[i];
        }

        //in place compute prod array

        return prod;
    }
    
}
