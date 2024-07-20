class BFS {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1) return -1;
        int count = 1;
       
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0,1},{1, -1},{1,0},{1,1}};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;


        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                int[] position = queue.poll();
                int row = position[0], col = position[1];

                if(row==n-1 && col ==n-1)return count;

                for(int j = 0;j<8;j++){
                    int newRow = row+directions[j][0];
                    int newCol = col+directions[j][1];
                    if(newRow>=0 && newCol>=0 && newRow<n && newCol<n&& grid[newRow][newCol]==0&& !visited[newRow][newCol]){
                        visited[newRow][newCol]= true;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
            count++;
        }
        return -1;

    }
}
