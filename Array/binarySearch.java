public class binarySearch {
    public static int binaSerach(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int key = -1;
        int index = binaSerach(num, -1);
        System.out.println(index);
    }
    
}
