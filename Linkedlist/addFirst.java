public class addFirst {//  add First Method
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;

    }
}