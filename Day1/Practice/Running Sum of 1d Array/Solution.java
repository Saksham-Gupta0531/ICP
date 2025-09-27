class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1 ;i < nums.length ;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        
        System.out.print("Input: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + (i < nums.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}