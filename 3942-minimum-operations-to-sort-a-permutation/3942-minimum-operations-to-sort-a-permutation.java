
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        int k = nums[0];
        boolean normal = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != (k + i) % n) {
                normal = false;
                break;
            }
        }

        if (normal) {
            if (k == 0) {
                ans = 0;
            } else {
                ans = Math.min(n - k, k + 2);
            }
        }

        boolean reversed = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != (nums[0] - i + n) % n) {
                reversed = false;
                break;
            }
        }

        if (reversed) {
            int rotations = n - 1 - nums[0];
            int operations = 1 + Math.min(rotations, n - rotations);
            ans = Math.min(ans, operations);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
