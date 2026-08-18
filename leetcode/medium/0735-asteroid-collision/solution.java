class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            list.add(asteroids[i]);
        }
        int k=0;
        while(k<list.size()-1){
                int a=list.get(k);
                int b=list.get(k+1);
                if(a>0 && b<0){
                    
                    if(Math.abs(a)<Math.abs(b)){
                        list.remove(k);
                                            if (k > 0) {
                        k--;
                    }
                    }
                    else if(Math.abs(a)>Math.abs(b)){
                        list.remove(k+1);
                                            if (k > 0) {
                        k--;
                    }
                    }
                    else{
                        list.remove(k+1);
                        list.remove(k);
                                            if (k > 0) {
                        k--;
                    }

                    }
                
                }
                else{
                    k++;
                }
            }
        

       int[] ans=new int[list.size()];
       int j=0;
       for(int n:list){
        ans[j]=n;
        j++;
       }
       return ans;

    }
}