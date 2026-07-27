class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>box=new Stack<>();
        for(int i=0; i<arr.length;i++){
          ans.add(-1);  
            
        }
        for(int i=arr.length-1;i>=0;i--){
            while(!box.isEmpty() && box.peek()<=arr[i]){
                box.pop();
            }
            if(!box.isEmpty()){
                ans.set(i,box.peek());
            }
            box.push(arr[i]);
        }
        return ans;
        
    }
}