public class App {
    public static void main(String[] args) throws Exception {
        int[][] nums = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(richest(nums));
    }
    static int richest(int[][] nums){
        int maxWealth = 0;
        for(int row = 0; row<nums.length; row++){
            int sum = 0;
            for(int col = 0; col<nums[row].length; col++){
                sum = sum + nums[row][col];
            }
            if(sum>maxWealth)
                maxWealth = sum;
        }
        return maxWealth;
    }
}
