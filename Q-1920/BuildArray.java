import java.util.Arrays;

public class BuildArray {
  public static void main(String[] args){
    int[] nums = {1,4,5,2,8,3};
    System.out.println(Arrays.toString(build(nums)));
  }
  
  public static int[] build(int[] nums){
    int[] ans = new int[nums.length];
    for(int i = 0; i<nums.length; i++){
      if(nums[i]<nums.length)
        ans[i] = nums[nums[i]];
    }
    return ans;
  }
}
