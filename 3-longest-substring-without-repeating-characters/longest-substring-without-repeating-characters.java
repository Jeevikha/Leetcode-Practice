public class Solution{
    public int lengthOfLongestSubstring(String s){
        int[] map=new int[128];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map[c]>left) left=map[c];
            int len=right-left+1;
            if(len>max) max=len;
            map[c]=right+1;
        }
        return max;
    }
}
