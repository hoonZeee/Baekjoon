package Level5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");

        String reverse1 = new StringBuilder(numbers[0]).reverse().toString();
        String reverse2 = new StringBuilder(numbers[1]).reverse().toString();

        int num1 = Integer.parseInt(reverse1);
        int num2 = Integer.parseInt(reverse2);

        System.out.println(Math.max(num1,num2));




    }
}
