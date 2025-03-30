package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermutationsGivenStringNoDuplicated {

    public static void main(String[] args) {
        
        String str = "aba";
        ArrayList<String> list = new ArrayList<>();
        solve(str, "", list);

        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void solve (String str, String op, ArrayList<String> list) {

        if (str.length() == 0) {
            list.add(op);
        }

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                String tmp = str.substring(0, i) + str.substring(i+1);
                solve(tmp, op+str.charAt(i), list);
            }
        }
    }
}
