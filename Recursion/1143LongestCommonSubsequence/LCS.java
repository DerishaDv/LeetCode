class LCS { // TLE//
    public int longestCommonSubsequence(String text1, String text2) {
        return lcsHelper(text1, text2, text1.length(), text2.length());
    }

    private int lcsHelper(String a, String b, int m, int n){
        if(m==0||n==0) return 0;
        if(a.charAt(m-1)==b.charAt(n-1)) return 1+ lcsHelper(a, b, m-1, n-1);
        else {
            return Math.max(lcsHelper(a, b, m-1, n), lcsHelper(a, b, m, n-1));
        }
    }
}
