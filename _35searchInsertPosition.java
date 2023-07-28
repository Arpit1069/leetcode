// Given a sorted array of distinct integers and a target value, return the index 
// if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
public class _35searchInsertPosition {
    
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
       for(int i=1;i<nums.length;i++){
           if(nums[i-1]< target && target< nums[i])
           {
                 return i;
           }
           else if(nums[i]<target){
               return i;
           }
            
       } 
       return -1;
    }
}