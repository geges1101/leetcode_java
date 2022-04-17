package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char[][] board = new char[9][9];

        for (int i=0;i<9;i++) {
            for (int j=0;i<9;i++) {
                board[i][j] = input.next().charAt(0);
            }
        }
        Solution s =  new Solution();
        System.out.println(s.isValidSudoku(board));
    }
    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            for(int i = 0; i != board.length; i++){
                if(!checkRow(board, i)) return false;
            }

            for(int i = 0; i != board.length; i++){
                if(!checkColumn(board, i)) return false;
            }

            int row, column;
            row = column = 0;
            while(row < board.length){
                while(column < board.length){
                    if(!checkBox(board, row, column)) return false;
                    column = column + 3;
                }
                row = row + 3;
            }

            return true;
        }

        public boolean checkRow(char[][] board, int row){
            HashSet<Character> curr = new HashSet<>();
            for(int i = 0; i != board.length; i++){
                if(curr.contains(board[row][i]) && board[row][i] != '.') return false;
                else curr.add(board[row][i]);
            }
            return true;
        }

        public boolean checkColumn(char[][] board, int column){
            HashSet<Character> curr = new HashSet<>();
            for(int i = 0; i != board.length; i++){
                if(curr.contains(board[i][column]) && board[i][column] != '.') return false;
                else curr.add(board[i][column]);
            }
            return true;
        }

        public boolean checkBox(char[][] board, int row, int column){
            HashSet<Character> curr = new HashSet<>();
            for(int i = row ; i != row + 3; i++){
                for(int j = column; j != column + 3; j++){
                    if(curr.contains(board[i][j]) && board[i][j] != '.') return false;
                    else curr.add(board[i][j]);
                }
            }
            return true;
        }

    }
}
