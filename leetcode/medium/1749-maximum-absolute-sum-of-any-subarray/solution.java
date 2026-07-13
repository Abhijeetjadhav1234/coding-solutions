class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int currpsum=0;
        int currnsum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            currpsum+=nums[i];
            maxsum=Math.max(currpsum,maxsum);
            if(currpsum<0){
                currpsum=0;
            }
            currnsum+=nums[i];
            minsum=Math.min(currnsum,minsum);
            if(currnsum>0){
                currnsum=0;
            }
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}