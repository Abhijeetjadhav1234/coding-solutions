class Solution {
    public int maxProduct(int[] nums) {
      int prefix=1;
      int sufix=1;
      int ans=nums[0];
      int n=nums.length;
      for(int i=0;i<nums.length;i++){
        if(prefix==0)prefix=1;
        if(sufix==0)sufix=1;
        prefix*=nums[i];
        sufix*=nums[n-i-1];
        int current=Math.max(prefix,sufix);
        ans=Math.max(ans,current);
      }  
      return ans;
    }
}