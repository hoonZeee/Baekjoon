
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> wait = new Stack<>();

        for (int i = 0; i < total; i++) {
            stack.push(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        stack = tempStack;

        int count = 1;
        while (!stack.isEmpty() || !wait.isEmpty()) {
            if (!stack.isEmpty() && stack.peek() == count) {
                stack.pop();
                count++;
            } else if (!wait.isEmpty() && wait.peek() == count) {
                wait.pop();
                count++;
            } else if (!stack.isEmpty()) {
                wait.push(stack.pop());
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
