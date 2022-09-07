import java.util.HashMap;
import java.util.Objects;

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i != t.length(); i++){
                int count = map.getOrDefault(t.charAt(i), 0);
                map.put(t.charAt(i), count + 1);
        }

        int l,r,sum, goal;
        l = r = sum = 0;
        goal = map.size();
        HashMap<Character,Integer> curr = new HashMap<>();
        int[] res = { -1, 0, 0 };

        while (r < s.length()) {
            char c = s.charAt(r);
            int count = curr.getOrDefault(c, 0);
            curr.put(c, count + 1);

            if (map.containsKey(c) && Objects.equals(curr.get(c), map.get(c))) sum++;

            while (l <= r && sum == goal) {
                c = s.charAt(l);
                if (res[0] == -1 || r - l + 1 < res[0]) {
                    res[0] = r - l + 1;
                    res[1] = l;
                    res[2] = r;
                }
                curr.put(c, curr.get(c) - 1);
                if (map.containsKey(c) && curr.get(c) < map.get(c)) sum--;
                l++;
            }
            r++;
        }
        return res[0] == -1 ? "" : s.substring(res[1], res[2] + 1);
    }
}