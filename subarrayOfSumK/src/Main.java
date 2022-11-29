import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[]subarrayOfSumK(int[] nums, int k) {
        if(nums.length == 1) return new int[]{nums[0]};

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i = 1; i != nums.length; i++){
            nums[i] *= nums[i - 1];
            map.put(nums[i], i);
        }

        for(int curr : nums){
            int other = k + curr;
            if(map.get(other) != null) return new int[]{map.get(curr), map.get(other)};
        }

        return null;
    }

}

class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i != n; i++){
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        for(int num : solution.subarrayOfSumK(nums, k)){
            System.out.print(num);
        }
    }
}

