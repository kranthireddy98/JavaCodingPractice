import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] grid =  {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        if (grid == null || grid.length == 0) System.out.println(0);

        int rows = grid.length, cols = grid[0].length;
        int islandCount = 0;
        Queue<int[]> queue = new LinkedList<>();


        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';


                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int x = cell[0], y = cell[1];


                        for (int[] dir : directions) {
                            int newX = x + dir[0];//1
                            int newY = y + dir[1];//0
                            System.out.println(newX + " " + newY);

                            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == '1') {
                                System.out.println(newX + " " + newY + "h");
                                queue.offer(new int[]{newX, newY});
                                grid[newX][newY] = '0';
                            }
                        }
                    }
                }
            }
        }
System.out.println(islandCount);
    }
}
