
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int ans = sumDigits(n); 
        System.out.println(ans);
        int u = sumDigits(ans);
        System.out.println(u);
        
    }
    // public static int nextsum(int n){
    //     while (n != 0) {
    //         n = sumDigits(n);
    //     }
    // }
    public static int sumDigits(int n){
        int sum =0;

        while (n!=0) {
            int lastdigit = n%10;
            sum += lastdigit;
            n /= 10;  
        }
        // System.out.println("sum is "+ sum);
        return sum;
    }
}

