package uniqueProblems;

public class RomanToInteger {
    
    public static void main(String[] args) {
        
        System.out.println(solve("XII", 0));
    }

    public static int solve(String str, int index) {

        if (index == str.length() - 1) {
            return getVal(str.charAt(index));
        }

        if ( getVal(str.charAt(index)) < getVal(str.charAt(index + 1))) {
            return solve(str, index + 1) - getVal(str.charAt(index));
        }

        else 
            return solve(str, index+1) + getVal(str.charAt(index));

    }

    public static int getVal(char c) {

        switch (c) {
            case 'I':
                return 1;
        
            case 'V':
                return 5;
            case 'X':
                return 10;

            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 10000000;
        }
    }
}
