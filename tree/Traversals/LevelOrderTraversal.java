package tree.Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;

import tree.Node;

public class LevelOrderTraversal {
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(1);
        root.right.right = new Node(9);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        printLevelOrder(root);
        LevelOrderTraversal(root, 0, lists);

        System.out.println(lists.toString());
    }

    static void printLevelOrder(Node root)
    {
        Node current = root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {

            current = queue.remove();

            if (current != null)
                System.out.print(current.value);

            if (current == null && !queue.isEmpty()) {
                System.out.println();
                queue.add(null);
            }

            if (current != null && current.left != null)
                queue.add(current.left);
            
            if (current != null && current.right != null)
                queue.add(current.right);
        }

        return;
    }

    //Alternative

    static void LevelOrderTraversal(Node root, int level, ArrayList<ArrayList<Integer>> lists) {

        if (root == null)
            return;

        if (lists.size() - 1 >= level) {
            //System.out.println("Level: " + level + " val: " + root.value);
            lists.get(level).add(root.value);
        }

        if (lists.size() - 1 < level) {
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(root.value);
            lists.add(tmp);
            //System.out.println("value: " + root.value);
        }

        //System.out.println("root val: " + root.value + " level: " + level);

        LevelOrderTraversal(root.left, level+1, lists);
        LevelOrderTraversal(root.right, level+1, lists);
    }

}
