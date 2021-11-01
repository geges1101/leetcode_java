package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public String largestNumber(int[] nums) {
        String[] seq = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            seq[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(seq, new Comparator<String>(){
            public int compare(String a, String b){
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
            }
        });

        if(seq[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : seq){
            sb.append(s);
        }
        return sb.toString();
    }
}
