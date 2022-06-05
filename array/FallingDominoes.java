package array;

import java.util.Arrays;

public class FallingDominoes {
    
    public static void main(String[] args) {


        int [] input = new int[] {1, 0, 0, 1, 0, 0, 0, -1, 1, 0, -1};

        int flag = -999;
        int [] forces = input.clone();


        System.out.println(Arrays.toString(input));

        for(int i = 0; i < forces.length; i ++)
        {
            if (forces[i] == 1)
            {
                forces[i] = forces[i] * forces.length;
                flag = 1;
            }

            if (forces [i] == -1)
            {
                if(flag == 1)
                {
                    forces[i] = 0;
                    flag = 0;
                }
            }

            if (forces[i] == 0)
            {
                if (flag == 1)
                {
                    forces[i] = forces[i-1] - 1;
                }
            }

        }

                
        System.out.println(Arrays.toString(forces));

        int current = 0;

        for(int i = forces.length - 1; i >= 0 ; i --)
        {
            if (input[i] == -1)
            {
                current = input[i] * forces.length;
                forces[i] = current;
                flag = -1;
            }

            if (input [i] == 1)
            {
                if(flag == -1)
                {
                    flag = 0;
                    current = 0;
                    forces[i] = forces[i] + current;
                }
            }

            if (input[i] == 0)
            {
                if (flag == -1)
                {
                    current++;
                    forces[i] = forces[i] + current;
                }
            }

        }

        System.out.println(Arrays.toString(forces));
        
    }
}
