package com.company;

class Solution {
    public List<String> res;
    public String str;

    public List<String> restoreIpAddresses(String s) {
        this.res = new LinkedList();
        this.str = s;
        LinkedList<String> input = new LinkedList();
        backtrack(0, 4, input);
        return res;
    }

    public void backtrack(int start, int dotCnt, LinkedList<String> input){
        if(dotCnt==0){
            String ip = String.join(".", input);
            if(ip.length()==str.length()+3) {
                res.add(ip);
            }
        }
        for(int i= start; i< str.length(); i++){
            String temp = str.substring(start, i+1);
            if(Integer.valueOf(temp)>255||(temp.startsWith("0")&&temp.length()>1)){
                break;
            }
            input.add(temp);
            backtrack(i+1, dotCnt-1, input);
            input.removeLast();
        }
    }
}
