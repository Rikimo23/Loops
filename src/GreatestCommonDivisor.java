import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first positive integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = input.nextInt();


        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }


        System.out.printf("The GCD of %d and %d is %d.\n", n1, n2, gcd);
    }
}