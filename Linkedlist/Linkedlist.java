
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
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.Next != null){
            slow = slow.Next;
            fast = fast.Next.Next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.Next == null){
            return true;
        }
        Node midNode = findMid(head);
        
        Node prev = null;
        Node curr = midNode;
       // Node next;
        while(curr != null){
           Node next = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.Next;
            right = right.Next;
        }
        return true;
    }
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
       // l1.print();
        l1.addFirst(2);
       // l1.print();
        l1.addFirst(1);
       // l1.print();
      
        
        l1.addLast(3);
       // l1.print();
        l1.addLast(2);
       // l1.print();
        l1.addMiddle(4, 1);
       // l1.print();
        l1.addMiddle(2, 9);
       // l1.print();
        //System.out.println(l1.size);
        //l1.removeFirst();
        l1.print();
       // System.out.println(l1.size);
        //l1.removeLast();
       // l1.print();
        //System.out.println(l1.size);
       // System.out.println(l1.itrSearch(9));
        //System.out.println(l1.itrSearch(15));
      //  System.out.println(l1.recursionSearch(11));
      //l1.reverseLL();
      //l1.print();
      l1.delNthNodeEndSide(4);
      l1.print();
      System.out.println(l1.checkPalindrome());
      

       
        
        
    }
}
