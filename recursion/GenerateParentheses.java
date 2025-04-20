package recursion;

public class GenerateParentheses {
    
    public static void main(String[] args) {

        solve(3, 3, "");
    }

    public static void solve (int open, int close, String op) {

        if (open == 0 && close == 0)
        {
            System.out.println(op);
            return;
        }

        if (open > 0) 
            solve(open-1, close, op + "(");
        
        if (close > 0 && open < close)
            solve(open, close-1, op + ")");
    }
}
