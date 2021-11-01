package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    class Solution {
        public int findMinArrowShots(int[][] points) {
            HashSet<Integer> visited = new HashSet<>();
            int res = 0;
            while(visited.size() < points.length){
                int max = 0;
                int idx = 0;
                for(int i = 0; i != points.length; i++) {
                    int curr = points[i][1] - points[i][0];
                    if (curr > max && !visited.contains(i)) {
                        max = curr;
                        idx = i;
                    }
                }
                    for(int j = 0; j != points.length; j++){
                        if(points[j][0] <= points[idx][1]){
                            visited.add(j);
                        }
                    }
                    res++;
                }
            return res;
            }
        }
    }