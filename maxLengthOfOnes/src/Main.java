import java.util.Scanner;

class Solution {
    public int maxLengthofOnes(int[] nums) {
        int max = 0, count = 0, zeroes = 0;
        int n = nums.length;

        for(int i = 0; i != n; i++){
            if(nums[i] == 1){
                while(zeroes < 2 && i < n){
                    if(nums[i] == 0) zeroes++;
                    count++;
                    i++;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i != n; i++)
            nums[i] = sc.nextInt();

        Solution solution = new Solution();
        System.out.print(solution.maxLengthofOnes(nums));
    }
}