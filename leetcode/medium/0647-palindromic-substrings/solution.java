class Solution {
    public boolean palindrome(String str, int i,int j){
        while(i<=j){
          if(str.charAt(i)!=str.charAt(j))
          return false;

          i++;
          j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int mmax=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palindrome(s,i,j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}