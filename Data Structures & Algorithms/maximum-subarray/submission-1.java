class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int sum =0;
            for(int j =i; j<nums.length; j++){
                sum = sum+ nums[j];
                ans = Math.max(sum , ans);
                
            }
        }
        return ans;
    }
}
