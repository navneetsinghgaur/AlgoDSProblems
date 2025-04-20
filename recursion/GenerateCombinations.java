package recursion;

public class GenerateCombinations {
    
    public static void main(String[] args) {
        
        //solve("1234", "", 0, 2);
        solveBetter("1234", "", 2);
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

    //Better Method

    public static void solveBetter (String str, String op, int k) {

        if (str.length() == 0 && op.length() == k) {
            System.out.println(op);
            return;
        }

        if (op.length() == k) {
            System.out.println(op);
            return;
        }

        if (str.isBlank())
            return;

        String tmp = null;
        if (str.length() > 1)
            tmp = str.substring(1);
        else
            tmp = "";

        Character chosen = str.charAt(0);

        solveBetter(tmp, op + chosen, k);
        solveBetter(tmp, op, k);

    }
}
