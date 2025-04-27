package tree.Paths;

import java.lang.reflect.Array;
import java.util.ArrayList;

import tree.Node;

public class RootToLeafPath {
    
    public static void main(String[] args) {
    
        Node root = new Node(5);

        root.right = new Node(6);
        root.right.left = new Node(1);
        root.right.right = new Node(9);
        root.right.right.left = new Node(98);
        root.right.right.left.left = new Node(99);


        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        ArrayList<Integer> list = new ArrayList<>();
        printAllRootLeafPaths(root, 0, list);
    }

    static void printAllRootLeafPaths (Node root, int row, ArrayList<Integer> list) {

        if (root == null)
        {
            return;
        }

        //array would work here, list doesn't
        list.add(row, root.value);

        if (root.left == null && root.right == null) {
            System.out.println(list);
        }

        printAllRootLeafPaths(root.left, row+1, list);
        printAllRootLeafPaths(root.right, row+1, list);
    }
}
