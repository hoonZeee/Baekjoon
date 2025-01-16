import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0 0")) {
                break;
            }
            String[] part = input.split(" ");
            int a = Integer.parseInt(part[0]);
            int b = Integer.parseInt(part[1]);
            int c = Integer.parseInt(part[2]);
            int sum = a+b+c;
            int max = Math.max(a,Math.max(b,c));

            if(max >= sum-max) bw.write("Invalid\n");
            else if(a == b && b == c) bw.write("Equilateral\n");
            else if(a == b || b == c || a == c)bw.write("Isosceles\n");
            else bw.write("Scalene\n");
        }
        bw.flush();
        bw.close();
    }

}
