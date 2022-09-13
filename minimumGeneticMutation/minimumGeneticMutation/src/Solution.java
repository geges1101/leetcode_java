import java.util.*;

public class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        char[] charSet = "ACGT".toCharArray();

        q.offer(start);
        visited.add(start);
        int mutations = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0){
                String curr = q.poll();
                if(curr.equals(end)) return mutations;
                char[] seq = curr.toCharArray();
                for(int i = 0; i < seq.length; i++) {
                    char old = seq[i];
                    for(char c: charSet) {
                        seq[i] = c;
                        String next = new String(seq);
                        if(!visited.contains(next) && bankSet.contains(next)) {
                            visited.add(next);
                            q.offer(next);
                        }
                    }
                    seq[i] = old;
                }
            }
            mutations++;
        }
        return -1;
    }
}