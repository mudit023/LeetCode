import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TrailingZero obj = new TrailingZero();
        int result = obj.trailingZeroes(n);
        System.out.println(result);
        sc.close();
    }
}
