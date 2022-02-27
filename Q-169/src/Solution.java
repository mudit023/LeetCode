public class Solution {
  int majorityEle(int[] nums){
    int ansIndex = 0;
    int count = 1;
    // Loop to assign count value to each element
    for (int i = 1; i < nums.length; i++) {
      if(nums[i]==nums[ansIndex])
        count++;
      else
        count--;
      if (count==0) {
        ansIndex = i;
        count = 1;
      }
    }
    // Loop to check if the element with count>0 is really the majority element
    count = 0;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i]==nums[ansIndex])
        count++;
    }
    if (count>nums.length/2) {
      return nums[ansIndex];
    }
    return -1;
  }
}


