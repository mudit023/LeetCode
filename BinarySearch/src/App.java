
public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,3,5,10,14,16,21};
        int target = 6;
        System.out.println(ceilingFun(nums, target));
    }

    static int ceilingFun(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid  = start + (end - start)/2;
            if(nums[mid] == target)
                return nums[mid];
            else if(nums[mid]<target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return nums[start];
    }
}
