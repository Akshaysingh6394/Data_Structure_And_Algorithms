import org.w3c.dom.Node;

public class search {
     public int itrSearch(int key){
        Node temp  = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.Next;
            i++;
        }
        return -1;
    }
    
}
