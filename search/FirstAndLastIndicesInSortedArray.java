package search;

public class FirstAndLastIndicesInSortedArray {
    
    public static void main(String[] args) {
        
        int [] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 11};
        printIndices(A, 9);
    }

    public static void printIndices (int []A, int key) 
    {
        int len = A.length, l = 0, r = len - 1, a = -999 , b = -999;
        int mid = 0;

        while (l < r) {

            mid = l + (r-l)/2;

            if ( A[mid] < key )
                l = mid + 1;

            else if (A[mid] > key)
                r = mid - 1;

            else if (A[mid] == key && A[mid - 1] < key)
            {
                a = mid;
                break;

/*                 if (a > -999 && b > -999)
                    break;
                
                l = mid + 1; */
            }
/*             else if (A[mid] == key && A[mid + 1] > key)
            {
                b = mid;
                
                if (a > -999 && b > -999)
                break;

                r = mid - 1;
            } */

            else if (A[mid] == key)
                r--;

            System.out.println( l + " " + r + " " + mid);
        }

        l = 0; 
        r = len - 1;

        while (l < r) {

            mid = l + (r-l)/2;

            if ( A[mid] < key )
                l = mid + 1;

            else if (A[mid] > key)
                r = mid - 1;

/*             else if (A[mid] == key && A[mid - 1] < key)
            {
                a = mid;

                if (a > -999 && b > -999)
                    break;
                
                l = mid + 1;
            } */

            else if (A[mid] == key && A[mid + 1] > key)
            {
                b = mid;
                break;
/*                 if (a > -999 && b > -999)
                break;

                r = mid - 1; */
            }

            else if (A[mid] == key)
                l++;

            System.out.println( l + " " + r + " " + mid);
        }


        System.out.println("a: " + a + " b: " + b);
    }
}
