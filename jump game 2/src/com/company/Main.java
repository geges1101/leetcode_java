package com.company;

public class Main {

    class Solution {
        int jump(int[] nums) {
            int l = 0, r = 0;
            int res = 0;
            while(r < nums.length - 1){
                int max_jump = 0;
                for(int i = l; i <= r; i++){
                    max_jump = Math.max(max_jump, i + nums[i]);
                }
                l = r + 1;
                r = max_jump;
                res++;
            }
            return res;
        }
    };
}
