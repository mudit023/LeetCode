import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
  public static void main(String[] args){
    System.out.println("Enter the size of the original array:");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] nums = new int[n];
    System.out.print("Enter array elemensts: ");
    for(int i=0; i<n; i++){
      nums[i] = in.nextInt();
    }
    System.out.println("Updated array: " + Arrays.toString(copy(nums)));
    in.close();
  }

  public static int[] copy(int[] nums){
    int[] result = new int[2*(nums.length)];
    int i=0;
    while(i < 2*(nums.length)){
      if (i<nums.length)
        result[i]=nums[i];
      else
        result[i]=nums[i-(nums.length)];
      i++;
    }
    return result;
  }
}
