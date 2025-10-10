import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static String[][] normal;
    static String[][] blindness;
    static StringTokenizer st;
    static boolean[][] visited;

    static int count;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        normal = new String[N][N];
        blindness = new String[N][N];

        for (int i = 0; i < N; i++) {
            String [] parts = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                normal[i][j] = parts[j];
                if(parts[j].equals("G")){
                    blindness[i][j] = "R";
                } else {
                    blindness[i][j] = parts[j];
                }
            }
        }

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    normalDfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);

        count = 0 ;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]){
                    blindnessDfs(i,j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void normalDfs(int x, int y){
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(normal[nx][ny].equals(normal[x][y]) && !visited[nx][ny]){
                    normalDfs(nx,ny);
                }
            }
        }
    }

    public static void blindnessDfs(int x, int y){
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(blindness[nx][ny].equals(blindness[x][y]) && !visited[nx][ny]){
                    blindnessDfs(nx,ny);
                }
            }
        }
    }


}
