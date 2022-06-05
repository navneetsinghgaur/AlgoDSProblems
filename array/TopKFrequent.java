package array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

//Pending
public class TopKFrequent {
    
    public static void main(String[] args) {
        
        int [] A = new int[] { 1, 2, 1, 1, 3, 3, 2, 2, 1};
        printTopKFrequent(A);
    }

    static void printTopKFrequent(int [] A)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < A.length; i++)
        {
            if (map.containsKey(A[i]))
                map.put(A[i], map.get(A[i])+1);
            else
                map.put(A[i], 1);
        }

        //create a heap from this hashmap with values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
//        maxHeap.add(e);

        //do pop k times in the heap
        
    }
}
