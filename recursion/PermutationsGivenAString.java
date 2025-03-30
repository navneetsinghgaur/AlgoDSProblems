package recursion;

public class PermutationsGivenAString {
    
    public static void main(String[] args) {
        
        String str = "abc";
        solve(str, "");
    }

    public static void solve (String str, String op) {

        if (str.length() == 0)
        {
            System.out.println(op);
        }

        for (int i = 0; i < str.length(); i++) {
            String tmp = str.substring(0, i) + str.substring(i+1);
            solve(tmp, op + str.charAt(i));
        }
    }
}
