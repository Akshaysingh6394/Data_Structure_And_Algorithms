
public class Linkedlist{
    public static class Node{
        int data;
        Node Next;
        public Node(int data){
            this.data = data;
            this.Next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode.Next;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+ "-->");
            temp = temp.Next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addLast(3);
        l1.print();
        l1.addLast(4);
        l1.print();
       
        
        
    }
}
