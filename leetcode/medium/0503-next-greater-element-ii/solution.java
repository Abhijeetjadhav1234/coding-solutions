class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>box=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            int num=nums[i%n];
            while(!box.isEmpty() && box.peek()<=num){
                box.pop();
            }

            if(i<n && !box.isEmpty()){
                ans[i]=box.peek();
            }
            box.push(num);
        }
        return ans;
    }
}