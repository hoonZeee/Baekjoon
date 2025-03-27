import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();

        int total = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < total; i++) {
            String input = br.readLine();
            if(Objects.equals(input, "ENTER")){
                set.clear();
            }else {
               if(!set.contains(input)){
                   set.add(input);
                   count++;
               }
            }
        }

        System.out.println(count);
    }

}
