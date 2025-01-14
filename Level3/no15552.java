package Level3;

import java.io.*;
import java.util.StringTokenizer;

public class no15552 {
      public static void main(String[] args) throws IOException {
          BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int total = Integer.parseInt(br.readLine());

          for (int i = 0; i < total; i++) {
//              String[] st = br.readLine().split(" ");
//              int a = Integer.parseInt(st[0]);
//              int b= Integer.parseInt(st[1]);
              StringTokenizer st = new StringTokenizer(br.readLine());
              int a = Integer.parseInt(st.nextToken());
              int b = Integer.parseInt(st.nextToken());
              int sum = a + b;
              bw.write(sum + "\n");
          }
          br.close();
          bw.flush();
          bw.close();
      }
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//
//public class no15552 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int total = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < total; i++) {
//            String[] inputs = br.readLine().split(" ");
//            int a = Integer.parseInt(inputs[0]);
//            int b = Integer.parseInt(inputs[1]);
//            int sum = a + b;
//            bw.write(sum + "\n");
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();
//    }
//}
