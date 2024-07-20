class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length, cols = colSum.length;
        int[][] mat = new int[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j] = rowSum[i]<colSum[j]?rowSum[i]:colSum[j];
                rowSum[i]-=mat[i][j];
                colSum[j] -=mat[i][j];

            }
        }
        return mat;

    }
}
