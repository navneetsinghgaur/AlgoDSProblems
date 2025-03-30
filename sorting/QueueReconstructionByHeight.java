package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//Incomplete
public class QueueReconstructionByHeight {

    public static void main(String[] args) {
        
        int [][]A = new int[][] {{7, 0},{4, 4},{7, 1},{5, 0},{6, 1}, {5, 2}};

        List<Person> list = new ArrayList<Person>(); 
        Collections.addAll(list, new Person(7, 0), new Person(4,4), new Person(7,1), new Person(5,0), new Person(6,1), new Person(5,2));

        list = sort(list);
        System.out.println(list.toString());
    }

    static List<Person> sort(List<Person> list)
    {
        //int rows = A.length, col = A[0].length;
       // Arrays.sort(Comparator.) 

       Collections.sort(list, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {

          if(p1.height != p2.height)
          {
              return p1.height - p2.height;
          }
          else
          {
              return p1.ahead - p2.ahead;
          }
        }
      });

      System.out.println(list.toString());

      return list;

    }
    
}

class Person {
    int height;
    int ahead;

    public Person(int height, int ahead) {
        this.ahead = ahead;
        this.height = height;
    }

    @Override
   public String toString() {
        return ("Person Height:"+this.height+
                    " Ahead : " + this.ahead);
   }
}
