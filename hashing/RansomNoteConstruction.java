package hashing;

import java.util.HashMap;

public class RansomNoteConstruction {

    public static void main(String[] args) {

        System.out.println("Possible: " + isRandomNotePossible("ABCDEF", "BED"));
        
    }

    public static boolean isRandomNotePossible(String magazine, String note) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
        {
            if (map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }
            else
            {
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i < note.length(); i++)
        {
            if( map.containsKey(note.charAt(i)) && (map.get(note.charAt(i)) > 0) )
            {
                map.put(note.charAt(i), map.get(note.charAt(i)) - 1);
            }
            else
                return false;
        }

        return true;
    }
    
}
