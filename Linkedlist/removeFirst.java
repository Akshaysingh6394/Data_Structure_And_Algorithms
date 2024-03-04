public class removeFirst {
    public int removeFirst(){
        if(size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;      
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.Next;
        size--;
        return val;
    }
    
}
