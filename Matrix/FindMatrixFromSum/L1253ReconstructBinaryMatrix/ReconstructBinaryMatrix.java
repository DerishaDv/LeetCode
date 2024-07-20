class ReconstructBinaryMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] c) {
        int cols = c.length;
        List<List<Integer>> matrix = new ArrayList<>();
        Integer[][]  mat = new Integer[2][cols];

        // Iteration
        for (int j = 0; j < cols; j++) {
            if(c[j]==2){
                if(upper>0 && lower > 0){
                    mat[0][j]=1;
                    mat[1][j]=1;
                    upper--; lower--;
                } else {
                    return new ArrayList<>();
                }
            } else if (c[j]==0){
                mat[0][j]=0;
                mat[1][j]=0;
            } else if( c[j]==1){
                if(upper>= lower && upper>0){
                    mat[0][j]=1;
                    upper--;
                    mat[1][j]=0;
                } else if (lower>0){
                    mat[0][j]=0;
                    mat[1][j]=1;
                    lower--;
                } else {
                    return new ArrayList<>();
                }
            }
        }
        if( upper>0||lower>0) return new ArrayList<>();

        matrix.add(Arrays.asList(mat[0]));
        matrix.add(Arrays.asList(mat[1]));
        return matrix;
    }
}
