import java.util.*;

class Cell {
    public int r, c;
    public Cell(int i, int j) {
        r = i;
        c = j;
    }
}

public class Bai1 {

    static int[][] grid;
    static boolean[][] visited;
    static int N, M;
    
    
    static int count_connected(int row, int col) {
        int cnt = 0;
        visited[row][col] = true;
        if (row > 0) {
            if (col > 0) {
                if (!visited[row - 1][col - 1] && grid[row - 1][col - 1] == 1)
                    cnt += 1 + count_connected(row - 1, col - 1);
            }
            if (col < M - 1) {
                if (!visited[row - 1][col + 1] && grid[row - 1][col + 1] == 1)
                    cnt += 1 + count_connected(row - 1, col + 1);
            }
            if (!visited[row - 1][col] && grid[row - 1][col] == 1)
                cnt += 1 + count_connected(row - 1, col);
        }
        if (row < N - 1) {
            if (col > 0) {
                if (!visited[row + 1][col - 1] && grid[row + 1][col - 1] == 1)
                    cnt += 1 + count_connected(row + 1, col - 1);
            }
            if (col < M - 1) {
                if (!visited[row + 1][col + 1] && grid[row + 1][col + 1] == 1)
                    cnt += 1 + count_connected(row + 1, col + 1);
            }
            if (!visited[row + 1][col] && grid[row + 1][col] == 1)
                cnt += 1 + count_connected(row + 1, col);
        }
        if (col > 0) {
            if (!visited[row][col - 1] && grid[row][col - 1] == 1)
                cnt += 1 + count_connected(row, col - 1);
        }
        if (col < M - 1) {
            if (!visited[row][col + 1] && grid[row][col + 1] == 1)
                cnt += 1 + count_connected(row, col + 1);
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                grid[i][j] = scanner.nextInt();
                visited[i][j] = false;
            }
        }
        int max = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (grid[i][j] == 0 || visited[i][j]) continue;       
                int cnt = count_connected(i, j);
                if (max < cnt) max = cnt;
            }
        }
        
        System.out.println(max + 1);
        scanner.close();
    }
}