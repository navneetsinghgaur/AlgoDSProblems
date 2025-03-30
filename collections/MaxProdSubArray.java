package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxProdSubArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(0);

        System.out.println( maxProduct(list));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int maxProduct(final List<Integer> A) {
        Iterator<Integer> iterator = A.iterator();
        int prod = 1, max = 0;
        while (iterator.hasNext())
        {
            prod = prod * iterator.next();
            if (prod >= max)
            {
                max = prod;
            }

            if(prod <= 0)
            {
                prod = 1;
                continue;
            }
        }
        return max;
    }
}
