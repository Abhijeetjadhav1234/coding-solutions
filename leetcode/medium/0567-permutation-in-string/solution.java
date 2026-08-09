class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int n=s1.length();
          int n2=s2.length();
                  if (n > n2) {
            return false;
        }

          HashMap<Character,Integer>mp1=new HashMap<>();

          for(char c:s1.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
          }
          for(int i=0;i<=n2-n;i++){
                HashMap<Character,Integer>mp2=new HashMap<>();
                for(int j=i;j<n+i;j++){
                    char ch=s2.charAt(j);
                    mp2.put(ch,mp2.getOrDefault(ch,0)+1);
                    
                }
                if(mp1.equals(mp2)){
                            return true;
                        }    
          }
          return false;
    }
}