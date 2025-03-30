package recursion;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {     
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);


        solve(list, "", 0, 9);

    }

    public static void solve (ArrayList<Integer> list, String op, int index, int sum) {

        if (sum == 0) {
            System.out.println(op);
            return;
        }

        if (sum < 0) {
            return;
        }

        for (int i = index; i < list.size(); i++) {

            solve(list, op + list.get(i), i+1, sum-list.get(i));
        }
    }
}
