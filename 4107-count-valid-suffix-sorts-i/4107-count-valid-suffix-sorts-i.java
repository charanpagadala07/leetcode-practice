class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int count = 0;
        int n = nums.length;
        int[] freq = new int[100001];
        for(int i = 0; i < n; i++){
            freq[nums[i]]++;
            freq[target[i]]--;
        }

        for(int x:freq){
            if(x!=0){
                return 0;
            }
        }

        boolean[] suffixSorted = new boolean[n];
        suffixSorted[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            suffixSorted[i] =
                suffixSorted[i + 1] && target[i] >= target[i + 1];
        }

        boolean prefixMatch = true;

        for (int i = 0; i < n; i++) {

            if (prefixMatch && suffixSorted[i]) {
                count++;
            }

            if (nums[i] != target[i]) {
                prefixMatch = false;
            }
        }
        return count;
    }
}