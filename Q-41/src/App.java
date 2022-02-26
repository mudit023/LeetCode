import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter Array Size: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        
        // Class Solution call
        Solution obj1 = new Solution();

        // Output
        System.out.println(obj1.firstMissingPositive(nums));

        // Output Array
        // System.out.println(Arrays.toString(a));
        in.close();
    }
}
