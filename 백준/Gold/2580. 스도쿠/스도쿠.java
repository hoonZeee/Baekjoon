import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9][9];
        
        for (int i = 0; i < 9; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        sudoku();

    }

    public static void sudoku () {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if(arr[row][col] == 0){
                    for (int num = 1; num <= 9; num++) {
                        if(isValid(row, col, num)){
                            arr[row][col] = num;
                            sudoku();
                            arr[row][col] = 0;
                        }
                    }

                    return;
                }
            }
        }

        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.exit(0);
    }

    public static boolean isValid(int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if(arr[row][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if(arr[i][col] == num) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if(arr[i][j] == num) return false;
            }
        }

        return true;
    }


}
