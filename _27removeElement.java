// Given an integer array nums and an integer val, remove all occurrences 
// of val in nums in-place. The order of the elements may be changed. 
// Then return the number of elements in nums which are not equal to val.
public class _27removeElement {
    
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i =0; i<nums.length;i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }

          return k;
    }
  
}