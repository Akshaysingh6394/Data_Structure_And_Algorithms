import org.w3c.dom.Node;

public class reverseLink {
       public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    
}
