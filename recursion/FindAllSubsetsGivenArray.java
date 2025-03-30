package recursion;

import java.util.ArrayList;

public class FindAllSubsetsGivenArray {
    
    public static void main(String[] args) {
     
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(7);

        String str = "";
        ArrayList<String> ret = new ArrayList<>();

        ret = findAll(list, 0, str, ret);

        for (String st : ret) {
            System.out.println(st);
        }

    }

    public static ArrayList<String> findAll(ArrayList<Integer> list, int index, String op, ArrayList<String> ret) {

        if(index == list.size()) {
            System.out.println(op);
            ret.add(op);
            return ret;
        }

        findAll(list, index+1, op + list.get(index), ret);
        findAll(list, index+1, op, ret);

        return ret;
    }
}
