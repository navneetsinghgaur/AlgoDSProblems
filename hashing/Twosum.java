package hashing;

import java.util.HashMap;

public class Twosum {
    
    public static void main(String[] args) {
        
        int [] a = {2, 7, 11, 15};
        Ret ret = TwoSum(a, 27);
        System.out.println( "a: " + ret.i1 + " b: "+ ret.i2);
    }

    public static Ret TwoSum(int []a, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        Ret ret = new Ret();

        for (int i = 0 ; i < a.length; i++)
        {
            if(map.containsKey( sum - a[i]))
            {
                ret.i1 = i;
                ret.i2 = map.get(sum - a[i]);
            }
            else 
            {
                map.put(a[i], i);
            }
        }

        return ret;
    }
}
