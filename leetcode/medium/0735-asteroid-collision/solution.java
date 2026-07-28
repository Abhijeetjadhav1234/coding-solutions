class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        List<Integer>l=new ArrayList<>();
        for(int x: asteroids){
            l.add(x);
        }
        int i=0;
        while(i<l.size()-1){
            int a=l.get(i);
            int b=l.get(i+1);
            if(a>0 && b<0){
                if(Math.abs(a)>Math.abs(b)){
                    l.remove(i+1);
                }
                else if(Math.abs(a)<Math.abs(b)){
                    l.remove(i);
                    if(i>0){
                        i--;
                    }
                }
                else{
                    l.remove(i+1);
                    l.remove(i);
                    if(i>0){
                        i--;
                    }
                }
            
            }else{
                i++;
            }
        }
     int[] ans=new int[l.size()];
     for(int j=0;j<l.size();j++){
        ans[j]=l.get(j);
     }

       return ans;
    }
}