class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {

        int ws=0;
	for(int i=0;i<k;i++)
	{
		ws+=nums[i]; // 1 -> 1+2 = 3-> 1+2+3 =6
		
	}
	double maxsum=ws;
    
    for(int i=k;i<nums.size();i++)
    {
        ws+=nums[i]-nums[i-k];
        maxsum=max(maxsum,double(ws));
    }
    return maxsum/k;
    }
};