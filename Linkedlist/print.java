public class print {
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
}