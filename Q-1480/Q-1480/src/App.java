import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums){
        int[] sum = new int[nums.length];
        int x = 0;
        for(int i=0; i<nums.length; i++){
                x += nums[i];
                sum[i] = x;
        }
        return sum;
    } 
}
