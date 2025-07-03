public class RatinaMaze {

    public static int mazeWays(int maze[][], int n, int m, int i, int j, boolean visited[][]) {

        if(i == n-1 && j == m-1) {
            return 1 ;
        }

        // backtracking

        if(i == n || j == m || maze [i][j] == 0 || i < 0 || j < 0 || visited[i][j]) {
            return 0 ;
        }

        visited [i][j] = true;

        int d = mazeWays(maze, n, m, i+1, j, visited);
        int r = mazeWays(maze, n, m, i, j+1, visited);
        int u = mazeWays(maze, n, m, i-1, j, visited);
        int l = mazeWays(maze, n, m, i, j-1, visited);

        visited[i][j] = false ;
        return (l+r+u+d);
    }
    public static void main(String args[]) {

        int maze[][] = {{1, 1, 1, 0},
                        {0, 0, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};

        int n = maze.length;
        int m = maze[0].length;

        boolean visited[][] = new boolean[n][m];

        System.out.print(mazeWays(maze, n, m, 0, 0, visited));
    }
}
