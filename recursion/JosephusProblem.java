package recursion;

import java.util.ArrayList;

public class JosephusProblem {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        solve(list, 2);

        // 2 3 4 5
    }

    public static void solve (ArrayList<Integer> list, int k)
    {
        int index = 0;
        solveAux(list, index, k-1);
    }

    public static void solveAux (ArrayList<Integer> list, int index, int k)
    {
        if(list.size() == 1)
        {
            System.out.println("Winner " + list.get(0));
            return;
        }

        index = (index + k) % list.size();
        list.remove(index);
        solveAux(list, index, k);
    }
}
