class Solution {
    public boolean palindrome(String str, int lv,int hv){
        while(lv<=hv){
            if(str.charAt(lv)!=str.charAt(hv))
            return false;

            lv++;
            hv--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxcnt=0;
        int ls=0;
        int hs=0;
        for(int i=0;i<s.length();i++){
            
            for(int j=i+1;j<s.length();j++){
                if(palindrome(s,i,j)){
                    if(maxcnt<j-i+1){
                        maxcnt=j-i+1;
                        ls=i;
                        hs=j;
                    }

                }
            }
        }
        return s.substring(ls,hs+1);
    }
}