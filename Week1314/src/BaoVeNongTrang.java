import java.util.Scanner;

public class BaoVeNongTrang {
    private static int[][] grid;
    private static boolean[][] visited;
    private static int N, M;

    public static void main(String[] args) {
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

        

        scanner.close();
    }
}
