class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binary_search(nums,target ,0 , nums.length-1,true);
        int right = binary_search(nums,target ,0 , nums.length-1,false);
        return new int[] {left , right};

    }
    public int binary_search(int[] nums,int target ,int l , int r,boolean isleft){
        while(l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid]== target ){
                if (isleft== true){    
                    if (mid == 0 ||nums[mid-1]< target){
                        return mid;
                    }
                    else {
                        r =mid -1;
                    }
                }
                else {
                    if (mid == nums.length - 1|| nums[mid+1]>target){
                        return mid;
                    }
                    else{
                        l =mid+1;
                    }
                }
            }
            else if(nums[mid]> target){
                r= mid-1;
            }
            else{
                l= mid+1;
            }
            
        }
        return -1;
    }
}