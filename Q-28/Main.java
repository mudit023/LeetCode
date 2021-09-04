import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int result = str();
    System.out.print(result);
  }

  public static int str() 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter needle: ");
    String needle = input.next();

    System.out.print("Enter haystack: ");
    String haystack = input.next();

    input.close();

    if(needle.isEmpty() || needle.equals(haystack)){ 
      return 0;
    }

    if(haystack.isEmpty()==false)
    {
      for(int i=0; i<haystack.length(); i++){
        if(needle.charAt(0) == haystack.charAt(i) && i+needle.length()<=haystack.length())
        {
          String part = haystack.substring(i, i+needle.length());
          if(part.equals(needle))
            return i;
        }
      }
    }
      return -1;
  }
}