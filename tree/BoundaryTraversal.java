package tree;

public class BoundaryTraversal {
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(1);
        root.right.right = new Node(9);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        printBoundary(root);
    }

    static void printBoundary(Node root)
    {
        printLeftBoundary(root);
        printLowerBoundary(root);
        printRightBoundary(root);
    }

    static void printLeftBoundary(Node root)
    {
        if (root == null)
            return;

        if (root.left != null){
            System.out.println(root.value);
            printLeftBoundary(root.left);
        }

        if (root.left == null  && root.right != null)
        {
            System.out.println(root.value);
            printLeftBoundary(root.right);
        }
    }

    
    static void printRightBoundary(Node root)
    {
        if (root == null)
            return;

        if (root.right != null)
        {
            printRightBoundary(root.right);
            System.out.println(root.value);
        }

        if (root.right == null && root.left != null)
        {
            printRightBoundary(root.left);
            System.out.println(root.value);
        }

    }


    static void printLowerBoundary(Node root)
    {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
        {
            System.out.println(root.value);
        }

        else
        {
            printLowerBoundary(root.left);
            printLowerBoundary(root.right);
        }
    }
}
