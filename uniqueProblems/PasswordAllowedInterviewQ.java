package uniqueProblems;

import java.util.Stack;

import stack.MaxInAStack;

//Pending

public class PasswordAllowedInterviewQ {
    
    /* Return Distance of the password 

    Conditions:
    0. Password length should be between 6 and 15 chars.
    1. There should be at least one lowerCase, upperCase and digit
    2. It should not have special chars
    3. It should not contain three consecutive repeating chars
    */

    public static void main(String[] args) {

        String pwd = "6654654";
        System.out.println(checkPassword(pwd));
    }

    static int checkPassword(String pwdString)
    {
        int repeatChars = 0, specialChars = 0;

        int digits = 0, lowerCase = 0, upperCase = 0;

        Stack<Character> stack = new Stack<>();

        if (pwdString.length() < 6) 
            return 6 - pwdString.length();

        if (pwdString.length() > 15)
            return pwdString.length() - 15;

        for (int i = 0; i < pwdString.length(); i++)
        {
            if ( Character.isDigit( pwdString.charAt(i)))
                digits++;
            
            else if (Character.isLowerCase(pwdString.charAt(i)))
                lowerCase++;
            
            else if (Character.isUpperCase(pwdString.charAt(i)))
                upperCase++;
            
            else 
                specialChars++;
            
            if ( stack.isEmpty() || stack.peek() == pwdString.charAt(i))
            {
                stack.push(pwdString.charAt(i));

                if (stack.size() == 3)
                {
                    repeatChars++;
                    stack.removeAllElements();
                }
            }

            else
            {
                stack.removeAllElements();
                stack.push(pwdString.charAt(i));
            }
        }
        
        System.out.println(digits + " " +  lowerCase + " " + upperCase + " " + repeatChars + " " + specialChars);

        return max(max(max(max(digits, lowerCase), upperCase), repeatChars), specialChars);

    }

    private static int max(int a, int b)
    {
        return (a > b)? a : b;
    }
}
