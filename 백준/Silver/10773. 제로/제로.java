import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while(total --> 0){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) stack.pop();
            else stack.push(num);
        }
        int count = 0;
        while (!stack.isEmpty()){
            count+=stack.pop();
        }
        System.out.println(count);
    }
}
