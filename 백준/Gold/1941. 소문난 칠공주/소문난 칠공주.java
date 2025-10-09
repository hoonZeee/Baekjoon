import java.io.*;
import java.util.*;

public class Main {
    static char[][] map = new char[5][5];
    static boolean[] selected = new boolean[25];
    static int answer = 0;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < 5; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        combination(0, 0);
        System.out.println(answer);
    }

  
    static void combination(int idx, int cnt) {
        if (cnt == 7) {
            if (isValid()) answer++;
            return;
        }

        if (idx >= 25) return;

        selected[idx] = true;
        combination(idx + 1, cnt + 1);

        selected[idx] = false;
        combination(idx + 1, cnt);
    }

   
    static boolean isValid() {
        List<int[]> list = new ArrayList<>();
        int sCount = 0;

        for (int i = 0; i < 25; i++) {
            if (selected[i]) {
                int x = i / 5;
                int y = i % 5;
                list.add(new int[]{x, y});
                if (map[x][y] == 'S') sCount++;
            }
        }

        
        if (sCount < 4) return false;
        
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];
        q.add(list.get(0));
        visited[list.get(0)[0]][list.get(0)[1]] = true;
        int connected = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;

                
                for (int[] pos : list) {
                    if (pos[0] == nx && pos[1] == ny && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        connected++;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

       
        return connected == 7;
    }
}
