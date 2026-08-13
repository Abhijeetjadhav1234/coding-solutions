class Solution {
    public boolean isPossible(int a, int b, int c) {
        // code here
        int maxnum=0;
        int n1=0;
        int n2=0;
        if(a>b && a>c){
            maxnum=a;
            n1=b+c;
            
        }
        if(b>a && b>c){
            maxnum=b;
            n1=a+c;;
        }
        if(c>b && c>a){
            maxnum=c;
            n1=b+a;
        }
        if (maxnum > 2 * (n1 + 1)) {
            return false;
        }

        return true;
        
    }
}