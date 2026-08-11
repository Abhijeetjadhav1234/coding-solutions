class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] ans=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        ans[i]=-1;
       }
       for(int i=0;i<nums1.length;i++){
        int j=0;
        while(j<nums2.length && nums1[i]!=nums2[j]){
            j++;
        }
        int k=j+1;
         while(k<nums2.length){
            if(nums2[j]<nums2[k]){
                ans[i]=nums2[k];
                break;
            }
            k++;
         }
       }
       return ans;
    }
}