class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return sum;
    }

    void backtrack(int[] nums, int index, int xor){
        if(index==nums.length){
            sum+=xor;
            return;
        }

        backtrack(nums, index+1, xor^nums[index]);

        backtrack(nums, index+1, xor);
    }
}