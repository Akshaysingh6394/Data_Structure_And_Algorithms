import org.w3c.dom.Node;

public class checkPalin {
     public Node findMid(Node head){// find mid node
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.Next != null){
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.Next == null){
            return true;
        }
        Node midNode = findMid(head);
        
        Node prev = null;
        Node curr = midNode;
       // Node next;
        while(curr != null){
           Node next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.Next;
            right = right.Next;
        }
        return true;
    }
    
}
