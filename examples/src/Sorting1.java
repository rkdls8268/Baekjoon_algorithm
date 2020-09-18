import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            numArray.add(in.nextInt());
        }

        Collections.sort(numArray);

        for (int i = 0; i < numArray.size(); i++) {
            System.out.println(numArray.get(i));
        }
    }
}