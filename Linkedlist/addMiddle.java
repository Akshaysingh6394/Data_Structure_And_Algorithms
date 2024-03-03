public class addMiddle {// addMiddle Method
    public void addMiddle(int idx , int data){
        Node newNode = new Node(data);
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.Next;
            i++;
        }
        newNode.Next = temp.Next;
        temp.Next = newNode;
}
}
