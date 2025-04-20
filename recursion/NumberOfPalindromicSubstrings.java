package recursion;

public class NumberOfPalindromicSubstrings {
    
    public static void main(String[] args) {
        
        int num = solve("adabada");
        System.out.println(num);
    }

public static int solve(String str) {

        int max = 0;
        String palin = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            int left = i;
            int right = left;

            while (left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right)) {

                if (right-left >= 1) {
                    count++;
                }


                if (right-left+1 > max)
                {
                    max = right-left+1;
                    palin = str.substring(left, right+1);
                }

                left--;
                right++;
            }
            
            left = i;
            right = left +1;

            while (left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right)) {


                if (right-left >= 1) {
                    count++;
                }

                if (right-left+1 > max)
                {
                    max = right-left+1;
                    palin = str.substring(left, right+1);
                }
                left--;
                right++;
            }

        }

        return count;
    }
}
