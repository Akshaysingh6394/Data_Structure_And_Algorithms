import org.w3c.dom.Node;

public class deleteNthEndSide {
      public void delNthNodeEndSide(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.Next;
            sz++;
        }
        if(n == sz){
            head = head.Next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.Next;
            i++;
        }
        prev.Next = prev.Next.Next;
        return;
    }
    
    
}
