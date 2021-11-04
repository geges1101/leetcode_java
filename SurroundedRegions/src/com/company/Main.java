package com.company;

public class Main {

    class Solution {

        void visit(char[][] board, int i, int j){
            if( i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] !='O') return ;
            board[i][j] = 'S';
            visit(board,i-1,j);
            visit(board,i+1,j);
            visit(board,i,j-1);
            visit(board,i,j+1);
        }

        void solve(char[][] board) {
            int m = board.length;
            int n = board[0].length;
            int i,j;

            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if((j==n-1 || i == m-1 || j == 0 || i == 0) && board[i][j]=='O'){
                        visit(board,i,j);
                    }
                }
            }

            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if(board[i][j] == 'O')board[i][j]='X';
                    else if(board[i][j] == 'S')board[i][j]='O';
                }
            }
        }
    }
}
