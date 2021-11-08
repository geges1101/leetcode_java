package com.company;

public class Main {

    class Solution {
        public void flatten(TreeNode root) {
            if(root == null) return;
            Stack<TreeNode> s = new Stack<>();
            s.push(root);

            while(!s.isEmpty()){
                TreeNode curr = s.pop();
                if(curr.right != null){
                    s.push(curr.right);
                }
                if(curr.left != null){
                    s.push(curr.left);
                }
                if(!s.isEmpty()){
                    curr.right = s.peek();
                }
                curr.left = null;
            }
        }
    }
}
