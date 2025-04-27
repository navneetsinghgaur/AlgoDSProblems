package tree.Views;

import java.util.*;

import tree.Node;

public class TopView {
    
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

        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        TopView(root, 0, 0, map);

        System.out.println(map);

        for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
            System.out.println(entry.getValue().get(0));
        }
    }

    static void TopView(Node root, int row, int col, Map<Integer, ArrayList<Integer>> map) {

        if (root == null)
            return;

        if (map.get(col) == null)
        {
            map.put(col, new ArrayList<Integer>());
            map.get(col).add(root.value);
        }
        else {
            map.get(col).add(root.value);
        }

        TopView(root.left, row+1, col - 1, map);
        TopView(root.right, row+1, col + 1, map);
    }
}
