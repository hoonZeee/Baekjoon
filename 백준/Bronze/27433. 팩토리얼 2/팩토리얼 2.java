import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(br.readLine());

        if(input == 0){
            System.out.println("1");
        }else{
            long temp = input-1;
            long fac =input;


            for (int i = 1; i < input; i++) {
                fac *= temp;
                temp--;
            }
            System.out.println(fac);
        }


    }
}
