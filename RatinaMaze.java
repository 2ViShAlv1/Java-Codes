public class RatinaMaze {

    public static int mazeWays(int maze[][], int n, int m, int i, int j, boolean visited[][]) {
        // Check if out of bounds
        if (i >= n || j >= m || i < 0 || j < 0) {
            return 0;
        }

        // Check if the cell is blocked or already visited
        if (maze[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        // Base case: reach the bottom-right corner
        if (i == n-1 && j == m-1) {
            return 1;
        }

        // Mark the cell as visited
        visited[i][j] = true;

        // Move in all four possible directions
        int d = mazeWays(maze, n, m, i+1, j, visited); // move down
        int r = mazeWays(maze, n, m, i, j+1, visited); // move right
        int u = mazeWays(maze, n, m, i-1, j, visited); // move up
        int l = mazeWays(maze, n, m, i, j-1, visited); // move left

        // Unmark the cell as visited (backtrack)
        visited[i][j] = false;

        return l + r + u + d;
    }

    public static void main(String args[]) {
        int maze[][] = {{1, 1, 1, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 1},
                        {0, 1, 1, 1}};

        int n = maze.length;
        int m = maze[0].length;

        boolean visited[][] = new boolean[n][m];

        System.out.print(mazeWays(maze, n, m, 0, 0, visited));
    }
}
