package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindAllSubsetGivenSumK {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(1);

        int sum = 11;

        solve(list, sum, 0, "");
    }

    public static void solve(ArrayList<Integer> list, int sum, int index, String str) {

        if(sum == 0) {
            System.out.println(str);
            return;
        }

        if (sum < 0 || index >= list.size())
            return;
        
        solve(list, sum - list.get(index), index+1, str + list.get(index));
        solve(list, sum - list.get(index), index, str + list.get(index)); // For non repeat remove this
        solve(list, sum, index+1, str);

    }
}
