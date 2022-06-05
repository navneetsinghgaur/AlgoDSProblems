package hashing;

import java.util.HashMap;
import java.util.Map;

public class FindNonDuplicateNumber {

    public static void main(String[] args) {
        
        int [] A = new int [] {4, 3, 2, 1, 4, 3, 2, 1, 0};
        System.out.println(find(A));
        System.out.println(findXORVersion(A));
    }
    
    static int find(int []A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < A.length; i ++)
        {
            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i]) + 1);
            else
                map.put(A[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() == 1)
                return entry.getKey();
        }    

        return -9999;
    }

    static int findXORVersion(int []A) {

        int result = 0;
        for (int i = 0 ; i < A.length; i ++)
        {
            result ^= A[i];
        }

        return result;
    }
}
