class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<nums.length;i++){
            arr[i]=-1;
            for(int j=1;j<n;j++){
                int idx=(i+j)%n;
                if(nums[idx]>nums[i]){
                    arr[i]=nums[idx];
                    break;
                }
            }
        }
        return arr;

    }
}