import java.util.ArrayList;

public class RainwaterTrapping {

    public static int trap(ArrayList<Integer> height) {
        int n = height.size();

        if (n <= 2) {
            return 0; // No trapping possible with less than 3 elements
        }

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, height.get(left));
            rightMax = Math.max(rightMax, height.get(right));

            if (leftMax < rightMax) {
                trappedWater += leftMax - height.get(left);
                left++;
            } else {
                trappedWater += rightMax - height.get(right);
                right--;
            }
        }

        return trappedWater; // return total trapped water
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(0);
        height.add(1);
        height.add(0);
        height.add(2);
        height.add(1);
        height.add(0);
        height.add(1);
        height.add(3);
        height.add(2);
        height.add(1);
        height.add(2);
        height.add(1);

        int result = trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }
}
