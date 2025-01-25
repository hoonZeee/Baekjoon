import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

       
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]); 
            points[i][1] = Integer.parseInt(input[1]); 
        }

        
        Arrays.sort(points, (p1, p2) -> {
            if (p1[1] == p2[1]) {
                return Integer.compare(p1[0], p2[0]); 
            }
            return Integer.compare(p1[1], p2[1]); 
        });

      
        for (int[] point : points) {
            bw.write(point[0] + " " + point[1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
