import org.w3c.dom.Node;

public class searchRecusion {
     public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0 ;
        }
        int idx = helper(head.Next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursionSearch(int key){
        return helper(head, key);

    }
    
}
