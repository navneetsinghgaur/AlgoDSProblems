package recursion;

public class Leetcode1849DecreasingOne {

    public static void main(String[] args) {
        
        String str = "005043";
        System.out.println(isDecreasingOne(str, "", 0));
    
    }

    static boolean isDecreasingOne(String ip, String op, int index) {
        
        String tmp = ip.substring(0, index-1) + ip.substring(index);

        isDecreasingOne(ip, op, index);

        return false;
    }
    
}
