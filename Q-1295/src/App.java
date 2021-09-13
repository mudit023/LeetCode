public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {-4375,315,322,431,686,264,442};
        System.out.println(countEven(nums));
    }
    static int countEven(int[] nums){
        int evenDigits = 0;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            if(nums[i]<0)
                nums[i] = nums[i] * -1;
            count = (int)(Math.log10(nums[i])) + 1;
            if(count%2 == 0)
                evenDigits++;
        }

        return evenDigits;
    }
}
