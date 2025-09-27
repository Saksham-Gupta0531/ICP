import java.util.Arrays;    
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        
        for (int i = 0 ;i< nums.length ; i++){
            int left =i+1;
            int right =nums.length-1;
            while (left < right){
                int value = nums[left]+nums[i]+nums[right];
                if( Math.abs(target-value)<Math.abs(target-result) )
                    result = value;
            
            if (target-value==0) return value; 
            else if (target>value) left++;
            else right--;
            }
        }
        return result;
    }
}