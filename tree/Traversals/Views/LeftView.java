package tree.Traversals.Views;

import java.util.ArrayList;
import java.util.logging.Level;

import tree.Node;

public class LeftView {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(1);
        root.right.right = new Node(9);
        root.right.right.left = new Node(98);
        root.right.right.left.left = new Node(99);


        root.left.left = new Node(2);
        root.left.right = new Node(4);

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        LevelOrderTraversal(root, 0, lists);
        LeftView(root, lists);

        //System.out.println(lists.toString());
    }

    public static void LeftView(Node root, ArrayList<ArrayList<Integer>> lists) {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).get(0));
        }
    }

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
