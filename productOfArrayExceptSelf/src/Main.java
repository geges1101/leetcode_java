class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int curr = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= curr;
            curr *= nums[i];
        }
        return result;
    }
}