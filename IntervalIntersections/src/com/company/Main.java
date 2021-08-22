package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    class Solution {
        public int[][] intervalIntersection(int[][] A, int[][] B) {
            List<int[]> res = new ArrayList();
            int i = 0, j = 0;

            while (i < A.length && j < B.length) {
                int begin = Math.max(A[i][0], B[j][0]);
                int end = Math.min(A[i][1], B[j][1]);
                if (begin <= end)
                    res.add(new int[]{begin, end});

                if (A[i][1] < B[j][1])
                    i++;
                else
                    j++;
            }

            return res.toArray(new int[res.size()][]);
        }
    }