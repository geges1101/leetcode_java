package com.company;

public class Main {

    class Solution {
        public int strStr(String haystack, String needle) {
            if(needle.isEmpty()) return 0;
            int idx = -1;
            for(int i = 0; i != haystack.length(); i++){
                if(haystack.charAt(i) == needle.charAt(0) && haystack.length() - i >= needle.length()){
                    int j = i + 1;
                    idx = j - 1;
                    while(j != i + needle.length()){
                        if (haystack.charAt(j) != needle.charAt(j - i)) {
                            idx = -1;
                            break;
                        }
                        j++;
                    }
                    if(idx != -1) return idx;
                }
            }
            return idx;
        }
    }
}
