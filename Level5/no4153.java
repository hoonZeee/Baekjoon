package Level5;

import java.util.Scanner;

public class no4153 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int i = 1,j =1,k= 1;
        while(i!=0 && j!=0 && k!=0){
            i= sc.nextInt();
            j= sc.nextInt();
            k= sc.nextInt();
            if (i  ==0 && j==0 &&k==0) {
                break;
            }
            if (i*i + j*j == k*k || j*j + k*k ==i*i || k*k + i*i == j*j)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
