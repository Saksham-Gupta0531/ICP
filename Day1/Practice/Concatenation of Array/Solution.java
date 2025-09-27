class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length]; 
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1};
        int[] result = solution.getConcatenation(nums);
        
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