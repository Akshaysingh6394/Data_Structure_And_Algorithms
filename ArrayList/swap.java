import java.util.ArrayList;

public class swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(12);
        System.out.println(list);
        // int start = 0;
        // int end = list.size();
        // while(start<end){
        //     int temp = list.get(start);
        //     list.get(start) = list.get(end);
        //     list.get(end) = temp;
        //     start++;
        //     end--;
        // }
        int idx1 = 1, idx2 = 3;
        swap(list,idx1,idx2);
        System.out.println(list);

    }  
    
}
