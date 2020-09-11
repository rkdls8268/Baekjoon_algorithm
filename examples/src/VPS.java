import java.util.Scanner;
import java.util.Stack;

public class VPS {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack1 = new Stack<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            stack1.clear();
            String str = in.next();
            Boolean isVPS = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(')
                    stack1.push(c);
                else if (c == ')')
                    if (!stack1.isEmpty()) {
                        stack1.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
            }
            if (!stack1.isEmpty()) isVPS = false;
            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}