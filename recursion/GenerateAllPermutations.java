package recursion;

import java.util.ArrayList;

public class GenerateAllPermutations {

    public static void main (String args[]) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        solveAux("123", "");
    } 

    public static void solve(ArrayList<Integer> list)
    {

    }

    // public static void solveAux(ArrayList<Integer> list, String op, int index)
    // {
    //     if(index == list.size())
    //     {
    //         System.out.println(op);
    //         return;
    //     }
        
    //     for(int i = 0; i < list.size(); i++)
    //     {
    //         int tmp = list.remove(index);
    //         solveAux(list, op + tmp, index+1);
    //         list.add(tmp);
    //     }
    // }

    public static void solveAux(String ip, String op)
    {
        if(ip.length() == 0)
        {
            System.out.println(op);
            return;
        }
        
        for(int i = 0; i < ip.length(); i++)
        {
            String tmp = ip.substring(0, i) + ip.substring(i+1);
            solveAux(tmp, op + ip.charAt(i));
        }
    }
}
