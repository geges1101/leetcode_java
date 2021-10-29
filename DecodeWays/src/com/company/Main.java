package com.company;

public class Main {
    class Solution {
        public int numDecodings(String s) {
            int dp[] = new int[s.length()];
            if(s.charAt(0)!='0')
                dp[0] = 1;

            for(int i=1;i<dp.length;i++)
            {
                char l = s.charAt(i);
                char r = s.charAt(i-1);

                if(l=='0'&& r=='0')
                {
                    dp[i] = 0;
                }
                else if(l=='0'&& r!='0')
                {
                    if(r=='1'|| r=='2')
                    {
                        dp[i] = (i>=2 ? dp[i-2]:1);
                    }
                }
                else if(l!='0'&& r=='0')
                {
                    dp[i] = dp[i-1];
                }
                else
                {
                    int x = Integer.parseInt(s.substring(i-1,i+1));
                    if(x<=26)
                    {
                        dp[i] = dp[i-1] + (i>=2?dp[i-2]:1);
                    }
                    else
                    {
                        dp[i] = dp[i-1];
                    }
                }
            }
            return dp[s.length()-1];
        }
    }
}
