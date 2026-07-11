class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int ans=arr[0];
        int best=arr[0];
        
        for(int i=1;i<arr.length;i++){
           
            int v2=arr[i]+best;
            best=Math.max(arr[i],v2);
            ans=Math.max(ans,best);
        }
        return ans;
    }
}
