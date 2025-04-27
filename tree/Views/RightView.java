package tree.Views;

import java.util.ArrayList;
import java.util.logging.Level;

import tree.Node;

public class RightView {
    
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
        printRightView(root, lists);
    }

    public static void printRightView(Node root, ArrayList<ArrayList<Integer>> lists) {
        LevelOrderTraversal(root, 0, lists);

        for (int i  = 0; i < lists.size(); i++) {
            int size = lists.get(i).size();
            System.out.println(lists.get(i).get(size - 1));
        }
    }

    static void LevelOrderTraversal(Node root, int level, ArrayList<ArrayList<Integer>> lists) {

        if (root == null)
            return;

        if (lists.size() == level) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.value);
            lists.add(list);
        }
        else {
            lists.get(level).add(root.value);
        }

        LevelOrderTraversal(root.left, level+1, lists);
        LevelOrderTraversal(root.right, level+1, lists);
    }
}
