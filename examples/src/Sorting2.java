import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sorting2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            List<Integer> numArray = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numArray.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(numArray);

            for (int i = 0; i < numArray.size(); i++) {
                System.out.println(numArray.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}