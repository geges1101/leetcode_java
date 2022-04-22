class Solution {
    public boolean canJump(int[] nums) {
        int lastValid = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastValid) lastValid = i;
        }
        return lastValid == 0;
    }
}