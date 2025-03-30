package array;

import java.util.HashSet;

public class PythagoreanTriplets {
    
    public static void main(String[] args) {

        int [] A = new int[] {5, 12, 14, 13, 16, 3};
        printPythagoreanTriplet(A);
        printPythagoreanTripletUsingHashSet(A);
    }

    static void printPythagoreanTriplet(int [] A)
    {
        int len = A.length;

        for (int i = 0; i < len; i++)
        {
            for (int j = i; j < len; j++)
            {
                for (int k = j; k < len; k++)
                {
                    if (( A[i]*A[i] + A[j]*A[j]) == A[k]*A[k])
                    {
                        System.out.println("Triplets: " + A[i] + " " + A[j] + " " + A[k]);
                    }
                }
            }
        }
    }
    
    static void printPythagoreanTripletUsingHashSet(int [] A)
    {
        int len = A.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0 ; i < len; i ++)
            set.add(A[i]*A[i]);

        for (int i = 0; i < len; i++)
        {
            for (int j = i; j < len; j++)
            {
                if (set.contains((A[i]*A[i] + A[j]*A[j])))
                    System.out.println("Triplets: " + A[i] + " " + A[j] + " " + (A[i]*A[i] + A[j]*A[j]) );
            }
        }
    }

}
