package recursion;

public class LetterCombinationOfPhoneNumber {
    
    public static void main(String[] args) {

        solve("23", 0, "");
    }

    public static void solve (String str, int index, String op)
    {

        if (index == str.length())
        {
            System.out.println(op);
            return;
        }

        if (str.charAt(index) == '2') {
            solve(str, index+1, op + "a");
            solve(str, index+1, op + "b");
            solve(str, index+1, op + "c");
        }
        else if (str.charAt(index) == '3') {
            solve(str, index+1, op + "d");
            solve(str, index+1, op + "e");
            solve(str, index+1, op + "f");
        }
    }
}
