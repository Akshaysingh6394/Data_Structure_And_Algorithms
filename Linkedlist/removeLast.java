import org.w3c.dom.Node;

public class removeLast {
     public int removeLast(){
        if(size == 0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.Next;
            
        }
        int val = prev.Next.data;
        prev.Next = null;
        tail = prev;
        size --;
        return val;
    }
    
}
