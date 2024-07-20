class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int r = dungeon.length;
        int c = dungeon[0].length;

        int[][] dp = new int[r][c];

        // Health needed to be at the cell where princess present
        dp[r-1][c-1] = Math.max(1, 1-dungeon[r-1][c-1]);

        // Filling the health needed int the last row and col
        for(int i = r-2;i>=0;i--){
            dp[i][c-1] = Math.max(1, dp[i+1][c-1]-dungeon[i][c-1]);
        }

        for(int i = c-2;i>=0;i--){
            dp[r-1][i] = Math.max(1 , dp[r-1][i+1]-dungeon[r-1][i]);
        }

        for(int i = r-2; i>=0;i--){
            for(int j = c-2; j>=0; j--) {
                int min = Math.min(dp[i+1][j], dp[i][j+1]);
                dp[i][j] = Math.max(1, min- dungeon[i][j]);
            }
        }

        return dp[0][0];
        
    }
}
