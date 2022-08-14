import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (lhs, rhs) -> Integer.compare(lhs[0], rhs[0]));
        List<int[]> result = new ArrayList();
        int[] curr = intervals[0];
        result.add(curr);

        for(int[] interval : intervals){
            int begin1 = curr[0];
            int end1 = curr[1];
            int begin2 = interval[0];
            int end2 = interval[1];

            if(end1 >= begin2) curr[1] = Math.max(end1, end2);
            else{
                curr = interval;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}