package linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = head;

        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }

        temp = inefficientReverse(head);     

        System.out.println("Reverse");

        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    static Node inefficientReverse(Node head)
    {
        //Use the stack to reverse the LinkedList

        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        queue.remove();

        Node prev = null, temp = null, newHead = null;

        while (head != null)
        {
            stack.push(head);
            head = head.next;
        }

        while (!stack.empty()) 
        {
            temp = stack.pop();

            if(prev == null)
            {   
                prev = temp;
                newHead= temp;
            }
            else
                prev.next = temp;

            prev = temp;
        }

        temp.next = null;

        return newHead;
    }


    static Node efficientReverse(Node head)
    {
        Node prev = null, next = null, curr = head;
        
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
}
