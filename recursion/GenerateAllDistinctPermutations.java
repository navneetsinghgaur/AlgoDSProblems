package recursion;

import java.util.Arrays;
import java.util.HashSet;

public class GenerateAllDistinctPermutations {
    
    public static void main(String[] args) {
        String s = "ABCA";
        Arrays.sort(s.toCharArray());
        printAllPermutations(s, "");
    }

    public static void printAllPermutations(String s, String l)
    {
        if (s.length() < 1) {
            System.out.println("String: " + s+l);
        }
        //unordered_set<Character> uset;
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                continue;
            }
            else {
                set.add(s.charAt(i));
            }
            String temp = "";
            if (i < s.length() - 1) {
                temp = s.substring(0, i) + s.substring(i + 1);
            }
            else {
                temp = s.substring(0, i);
            }
            printAllPermutations(temp, l + s.charAt(i));
        }
    }
}
