package linkedlist;
public class AddTwoNumber { 
    public static void main(String[] args) {
        
        /* For number 551, we are storing them in the reverse */
        Node head1 = new Node(1);
        head1.next = new Node(5);
        head1.next.next = new Node(5);

        /* For number 658, we are storing them in the reverse */
        Node head2 = new Node(8);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        Node node = addTwoNumbers(head1, head2);

        while (node != null)
        {
            System.out.println(node.value);
            node= node.next;
        }

        //reverse the output Linked List or reverse the output text to get the accurate answer.
    }

    public static Node addTwoNumbers(Node head1, Node head2)
    {
        int sum = 0, c = 0;
        Node head = null, prev = null, node = null;

        while(head1 != null || head2 != null) 
        {
            if (head1 != null && head2 != null)
            {
                sum = head1.value + head2.value + c;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if (head1 == null)
            {
                sum = head2.value + c;
                head2 = head2.next;
            }
            else
            {
                sum = head1.value + c;
                head1 = head1.next;
            }

            c = sum / 10;

            node = new Node(sum % 10);

            if (head == null)
            {
                head = node;
            }
            else
            {
                prev.next = node;
            }

            prev = node;
        }

        if (c > 0)
            prev.next = new Node(c);

        return head;
    }
}
