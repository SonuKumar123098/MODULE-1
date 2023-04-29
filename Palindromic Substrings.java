//https://leetcode.com/problems/palindromic-substrings/description/
class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            cnt++;
            int start=i-1; int end=i+1;
            while(end<s.length() && s.charAt(i)==s.charAt(end)){
                cnt++; end++;
            }
            // if(res.length()%2==1) continue;
            if(start>=0 && end<s.length()){
                while(s.charAt(start)==s.charAt(end)){
                    cnt++;
                    start--;
                    end++;
                    if(start<0 || end>=s.length()) break;
                }
            }
        }
        return cnt;
    }
}
