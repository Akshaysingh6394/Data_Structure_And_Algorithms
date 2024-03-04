
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
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.Next = newNode;
        tail = newNode;
    }
    public void addMiddle(int idx , int data){
        Node newNode = new Node(data);
        size++;
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
        l1.addFirst(2);
        l1.print();
        l1.addFirst(1);
        l1.print();
      
        
        l1.addLast(3);
        l1.print();
        l1.addLast(4);
        l1.print();
        l1.addMiddle(4, 11);
        l1.print();
        l1.addMiddle(2, 9);
        l1.print();
        System.out.println(l1.size);
       
        
        
    }
}
