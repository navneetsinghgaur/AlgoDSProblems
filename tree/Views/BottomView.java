package tree.Views;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import tree.Node;

public class BottomView {
    
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

        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        BottomView(root, 0, 0, map);

        for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
            int last = entry.getValue().size();
            System.out.println(entry.getValue().get(last-1));
        }
    }

    static void BottomView(Node root, int row, int col, Map<Integer, ArrayList<Integer>> map) {

        if (root == null) {
            return;
        }

        if(map.get(col) == null) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.value);
            map.put(col, list);
        }
        else {
            map.get(col).add(root.value);
        }

        BottomView(root.left, row+1, col-1, map);
        BottomView(root.right, row+1, col+1, map);

    }
}
