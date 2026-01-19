public class Solution{
    public int countNumbersWithUniqueDigits(int n){
        if(n==0) return 1;
        int res=10;
        int cur=9;
        int available=9;
        for(int i=2;i<=n&&available>0;i++){
            cur*=available;
            res+=cur;
            available--;
        }
        return res;
    }
}
