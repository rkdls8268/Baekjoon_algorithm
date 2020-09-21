import java.util.Scanner;

public class Lcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int min = 1;
            int j = 1;
            while (j <= a && j <= b) {
                if (a % j == 0 && b % j == 0) {
                    min = j;
                }
                j++;
            }
            System.out.println(a*b/min);
        }
    }
}