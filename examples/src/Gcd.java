import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }

        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
}