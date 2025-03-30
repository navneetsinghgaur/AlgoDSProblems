package array;

public class SimpleCalculator {

    static int index = 0;
    public static void main(String[] args) { 
        String expr = "(-3 + (-3 + 2) + 5 + (-6))";
        int value = calculate(expr);
        System.out.println(value);
    }

    static int calculate(String expr)
    {
        int result = 0;
        char op = ' ';

        if (index > expr.length())
            return 0;

        for (int i = index; i < expr.length(); i++)
        {
            if (expr.charAt(i) == '+' || expr.charAt(i) == '-')
                op = expr.charAt(i);

            if (( Character.isDigit(expr.charAt(i))) && op == ' ')
                result += Character.getNumericValue(expr.charAt(i));
            
            if (op == '+' && Character.isDigit(expr.charAt(i)) )
            {
                result += Character.getNumericValue(expr.charAt(i));
                op = ' ';
            }

            if (op == '-' && Character.isDigit(expr.charAt(i)) )
            {
                result -= Character.getNumericValue(expr.charAt(i));
                op = ' ';
            }

            if (expr.charAt(i) == ')' )
            {
                index = i + 1;
                System.out.println("returning result: " + result);
                return result;
            }
            
            if (expr.charAt(i) == '(' )
            {
                index = i + 1;
                result += calculate(expr);
                i = index;
            }
        }

        return result;
    } 
}
