import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int n =in.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter array elements: ");
      for(int i=0; i<n; i++){
        arr[i] = in.nextInt(); 
      }
    
      System.out.println(Arrays.toString(arr)); // To print the array
      System.out.println("Enter the number you have to find:");
      int target = in.nextInt();
      in.close();
      
      int sol = binarySearch(arr, target);
      System.out.print(sol);



    }

    // Simple Binary Search
    public static int binarySearch(int arr[], int target){  
      int first = 0;
      int last = arr.length-1;  
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < target ){  
           first = mid + 1;     
         }
         else if ( arr[mid] == target ){  
           return mid;    
         }
         else{  
            last = mid - 1;  
         }
         mid = (first + last)/2;
           
      }
        return first; // This is the index where the target should be in the array if not found
    }  
  }
