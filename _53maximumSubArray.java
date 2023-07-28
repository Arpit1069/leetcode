public class _53maximumSubArray {
    
}

class Solution {
    public int maxSubArray(int[] nums) {
        int res=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            res = res + nums[i];
            if(res>maxSum){
               maxSum = res;
            }
            if(res<0){
                res = 0;
            }
        }
        return maxSum;
    }
}