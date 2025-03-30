package tree;

public class ValidBST
{
    public static void main(String[] args) {     

        //Constructing BST
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        System.out.println(isValidBST(root, -999999, 999999));
    }

    public static boolean isValidBST(Node root, int low, int high) {
        if (root == null)
            return true;

        if ((root.value > low) && (root.value < high) && isValidBST(root.left, low, root.value) && isValidBST(root.right, root.value, high))
            return true;

        return false;
    }
}