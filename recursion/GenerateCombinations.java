package recursion;

public class GenerateCombinations {
    
    public static void main(String[] args) {
        
        solve("1234", "", 0, 2);
    }

    public static void solve (String str, String op, int index, int k){

        if (op.length() == k) {
            System.out.println(op);
            return;
        }

        for (int i = index; i < str.length(); i++) {

            // String tmp = str.substring(0, i) + str.substring(i+1);
            // solve(tmp, op + str.charAt(i), index + 1, k);
            solve(str, op + str.charAt(i), i + 1, k);
        }
    }
}
