import java.util.*;

public class BaiCoNgonNhat {
    private static char[][] grid;
    private static boolean[][] visited;
    private static int N, M;
    
    private static void dfs(int row, int col) {
        visited[row][col] = true;
        if (row > 0) {
            if (!visited[row - 1][col] && grid[row - 1][col] == '#')
                dfs(row - 1, col);
        }

        if (row < N - 1) {
            if (!visited[row + 1][col] && grid[row + 1][col] == '#')
                dfs(row + 1, col);
        }

        if (col > 0) {
            if (!visited[row][col - 1] && grid[row][col - 1] == '#')
                dfs(row, col - 1);
        }

        if (col < M - 1) {
            if (!visited[row][col + 1] && grid[row][col + 1] == '#')
                dfs(row, col + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new char[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            String line = scanner.next().trim();
            for (int j = 0; j < M; ++j) {
                grid[i][j] = line.charAt(j);
                visited[i][j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (grid[i][j] == '.' || visited[i][j]) continue;       
                dfs(i, j);
                ++count;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}