class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
       int n=a/b;
        int maxcnt=0;
        for(int i=0;i<nums.length;i++){
            int evencnt=0;
            int oddcnt=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    evencnt++;
                }
                else{
                    oddcnt++;
                }
                if(oddcnt>0 && evencnt*b<=oddcnt*a){
                    maxcnt++;
                }
            }
        }
        return maxcnt;
    }
}