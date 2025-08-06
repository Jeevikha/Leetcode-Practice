class Solution {
public:
    int maxSubArray(vector<int>& nums) {
      int n=nums.size();
        int maxsum= INT_MIN ;
        int sum=0;
        for(int st=0;st<n;st++)
        {
           sum+=nums[st];
           maxsum=max(sum,maxsum);
           if(sum<0)
           {
            sum=0;
           }

        }
        return maxsum;
  
    }
};