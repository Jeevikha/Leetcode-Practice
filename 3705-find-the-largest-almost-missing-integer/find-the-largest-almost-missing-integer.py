class Solution:
    def largestInteger(self, nums, k):
        count_map = {}  
        result = -1  

        for i in range(len(nums) - k + 1):  
            subarray = nums[i:i + k]  
            unique_elements = set(subarray)  

            for num in unique_elements:  
                if num in count_map:  
                    count_map[num] += 1  
                else:
                    count_map[num] = 1  

        for num in count_map:
            if count_map[num] == 1:  
                result = max(result, num)  

        return result
        