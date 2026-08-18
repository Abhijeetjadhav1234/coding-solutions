class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            list.add(asteroids[i]);
        }
        boolean collisions =true;
        while(collisions){
            for(int i=0;i<=list.size()-1;i++){
                int a=list.get(i);
                int b=list.get(i+1);
                if(a>0 && b<0){
                    collisions=false;
                    if(Math.abs(a)<Math.abs(b)){
                        list.remove(i);
                    }
                    else if(Math.abs(a)>Math.abs(b)){
                        list.remove(i+1);
                    }
                    else{
                        list.remove(i+1);
                        list.remove(i);

                    }
                    break;
                }
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