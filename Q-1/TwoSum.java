public class TwoSum{
  public static void main(String[] args){
    
  }

  public int[] twoSum(int[] nums, int target){
    int n = 0;
    int sum = 0;
    int[] result = new int[n];
    for(int i=0; i<nums.length; i++)
    {
      sum = sum + nums[i];
      if (sum==target) {
        n=i;
        break;
      } 
    }

    
    return result;
  }
}