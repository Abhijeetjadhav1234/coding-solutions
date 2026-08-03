class Solution {
    public boolean palindrome(String str, int i,int j){
        while(i>=0 && j<str.length()){
          if(str.charAt(i)!=str.charAt(j))
          return false;
          i--;
          j++;
        }
        return true;
    }
    public int countSubstrings(String s) {
        if(s.length()==1){
            return 1;
        }
        int cnt=0;
        for(int i=0;i<s.length();i++){
        
                if(palindrome(s,i,i)){
                    cnt++;
                }
                if(palindrome(s,i,i+1)){
                    cnt++;
                }
            }
        
        return cnt;
    }
}