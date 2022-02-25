public class DuplicateNumber {
  int duplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[i] != i + 1) {
        if (nums[i] != nums[correct]) {
          int temp = nums[i];
          nums[i] = nums[correct];
          nums[correct] = temp;
        }
        else
          return nums[i];
      } 
      else
          i++;
    }
    return -1;
  }
}
