package recursion;

public class LongestPalindromincSubstring {

    public static void main(String[] args) {
        
        String str = solve("dabbadc");
        System.out.println(str);
    }

    public static String solve(String str) {

        int max = 0;
        String palin = "";

        for (int i = 0; i < str.length(); i++) {

            int left = i;
            int right = left;

            while (left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right)) {

                if (right-left+1 > max)
                {
                    max = right-left+1;
                    palin = str.substring(left, right+1);
                    System.out.println("D: "+ palin);
                }

                left--;
                right++;
            }
            
            left = i;
            right = left +1;

            while (left >= 0 && right <= str.length()-1 && str.charAt(left) == str.charAt(right)) {

                if (right-left+1 > max)
                {
                    max = right-left+1;
                    palin = str.substring(left, right+1);
                    System.out.println("C: "+ palin);
                }
                left--;
                right++;
            }

        }

        return palin;
    }
    
}
