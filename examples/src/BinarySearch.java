import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = in.nextInt();
        }
        Arrays.sort(nArray); // 이진탐색위해 오름차순으로 정렬

        m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int r = 0;
            int key = in.nextInt();

            int high = nArray.length-1;
            int low = 0;

            while (low <= high) {
                int mid = (high + low) / 2;

                if (nArray[mid] == key) {
                    r = 1;
                    break;
                } else if (nArray[mid] > key) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
            System.out.println(r);
        }
    }
}