

import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        while (n!=0) {
           int last = n%10;
           System.out.print(last);
           n /= 10;
        }

    }
}
