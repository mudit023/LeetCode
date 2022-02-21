import java.util.Arrays;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int[] arr = new int[5];
    System.out.println("Enter array elements:");
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i<5; i++){
      int n = sc.nextInt();
      arr[i] = n;
    }
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}