package recursion;

public class PowerOfXN {
    
    public static void main(String[] args) {
        
        double pow = solve(2, 11);
        System.out.println("pow: " + pow );
    }

    public static double solve(int x, int n) {

        if(n == 1)
            return x;

        if (n % 2 == 0)
            return (double) solve(x, n/2) * solve(x, n/2);

        else {
            return (double) x * solve(x, n-1);
        }
        
    }

}
