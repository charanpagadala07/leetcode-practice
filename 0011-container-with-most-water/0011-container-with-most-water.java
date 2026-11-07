class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int water = 0;

        while(left<right){
            int width = right -left;

            int min = Math.min(height[left], height[right]);

            int currentArea = width * min;

            water = Math.max(water, currentArea);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}