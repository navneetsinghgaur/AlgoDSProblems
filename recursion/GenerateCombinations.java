package recursion;

public class GenerateCombinations {
    
    public static void main(String[] args) {
        
        solve("1234", "", 0, 2);
    }

    public static void solve (String str, String op, int index, int k){

        if (op.length() == k) {
            System.out.println(op);
        }

        if (index >= str.length())
            return;

        for (int i = index; i < str.length(); i++) {
            solve(str, op + str.charAt(i), index + 1, k);
        }
    }
}
