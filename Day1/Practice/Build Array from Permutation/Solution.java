class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; 
        for (int i=0 ; i< nums.length ;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        
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
