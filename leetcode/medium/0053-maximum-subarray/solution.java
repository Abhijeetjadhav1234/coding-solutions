class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int best=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i]+best;
            best=Math.max(nums[i],v1);
            ans=Math.max(best,ans);
        }
        return ans;
    }
}