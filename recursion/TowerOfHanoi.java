package recursion;

public class TowerOfHanoi {
    
    public static void main(String[] args) {
        
        towerOfHanoi(1, 3, 2, 3);
    }

    public static void towerOfHanoi(int source, int destination, int aux, int n) 
    {
        if(n == 1)
        {
            System.out.println("moving last disk frompeg: " + source +  " to toPeg: " + destination);
            return;
        }
        towerOfHanoi(source, aux, destination, n-1);
        //move nth disk from source to destination

        System.out.println("moving frompeg: " + source +  " to toPeg: " + destination);

        towerOfHanoi(aux, destination, source, n-1);
    }
}
