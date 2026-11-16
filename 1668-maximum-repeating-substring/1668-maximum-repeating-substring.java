class Solution {
    public int maxRepeating(String sequence, String word) {
        int m = sequence.length();
        int n = word.length();

        int count = 0;
        int[] dp = new int[m+1];

        for(int i = n; i <= m; i++){
            if(sequence.substring(i-n, i).equals(word)){
                dp[i] = dp[i-n] + 1;
                count = Math.max(dp[i], count);
            }
        }

        return count;
    }
}