import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
       char[]s_array = s.toCharArray();
       char[]t_array = t.toCharArray();
       Arrays.sort(s_array);
       Arrays.sort(t_array);
       return Arrays.toString(s_array).equals(Arrays.toString(t_array));
    }
}