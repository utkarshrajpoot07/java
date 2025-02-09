import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {}
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Minimum steps to reducde " + minSteps(N));
    }

    public static int minSteps(int N) {
        int steps = 0;
        while (n>1) {
            if (n%2 == 0) { 
                n = n /2;
            } else { 
                n = n - 1;
            }
            steps++;
        }
        return steps;
    }


