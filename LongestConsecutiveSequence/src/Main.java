import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int i : set) {
            if (!set.contains(i-1)) {
                int curr = i;
                int count = 1;

                while (set.contains(curr+1)) {
                    curr += 1;
                    count += 1;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}