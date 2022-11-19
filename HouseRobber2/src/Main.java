class Solution {
    public int helper(int lo, int hi, int[] nums){
        int prev = 0, max = 0;
        for(int i = lo; i != hi; i++){
            int temp = max;
            max = Math.max(max, prev + nums[i]);
            prev = temp;
        }
        return max;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        return Math.max(helper(0, n - 1, nums), helper(1, n, nums));
    }
}