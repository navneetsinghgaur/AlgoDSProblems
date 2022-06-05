package matrix;

import java.util.*;

public class MinSumPathInMatrix {

    static int[][] mat;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>(2);
        ArrayList<Integer> a1 = new ArrayList<>(3);
        a1.add(2);
        a1.add(3);
        a1.add(5);

        ArrayList<Integer> a2 = new ArrayList<>(3);
        a2.add(1);
        a2.add(6);
        a2.add(9);

        A.add(a1);
        A.add(a2);

        System.out.println("Value: " + minPathSum(A));
    }

    public static int minPathSum(ArrayList<ArrayList<Integer>> A) {

        mat = new int[A.size()][A.get(0).size()];
        for(int i = 0; i < A.size(); i++)
         for(int j = 0; j < A.get(0).size(); j++)
            mat[i][j] = -999;

        int val = minPathValue(A, 0, 0);
        //System.out.println("val: " + val);
        return val;
    }

    public static int minPathValue(ArrayList<ArrayList<Integer>> A, int i, int j)
    {
        if( i == A.size()-1 && j == (A.get(i).size() -1))
            return A.get(i).get(j);

       if(mat[i][j] != -999)
            return mat[i][j];

        if (i < (A.size()-1) && j < (A.get(i).size() - 1) )
            return mat[i][j] = min(minPathValue(A, i+1, j), minPathValue(A, i, j+1)) + A.get(i).get(j);
        else if (i < (A.size()-1))
            return mat[i][j] = minPathValue(A, i+1, j) + A.get(i).get(j);
        else
            return mat[i][j] = minPathValue(A, i, j+1) + A.get(i).get(j);
    }

    static int min(int a, int b)
    {
        return ((a > b)?b:a);
    }
}


