import java.util.HashSet;
import java.util.Iterator;

class Trie {
    public static HashSet<String> words;
    public Trie() {
        words = new HashSet<>();
    }

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {
        int n = prefix.length();
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            String curr = it.next();
            if(curr.length() >= n){
                if(curr.substring(0, n).equals(prefix)) return true;
            }
        }
        return false;
    }
}