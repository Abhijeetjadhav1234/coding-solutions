class Solution {
    public boolean checkp(String s,int f,int l){
        while(f<=l){
            if(s.charAt(f)!=s.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
    
    public String longestPalindrome(String s) {
        String ans;
        int[] arr=new int[s.length()];
        int maxcnt=0;
        int sf=0;
        int ff=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++)
            if(checkp(s,i,j)){
             if(maxcnt<j-i+1){
                maxcnt = j - i + 1; 
                  sf=i;
                  ff=j;
             }
            }
        }
         return s.substring(sf,ff+1);
    }
}