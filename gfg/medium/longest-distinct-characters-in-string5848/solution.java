class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxcnt=0;
        for(int i=0;i<s.length();i++){
            Set<Character>set=new TreeSet<>();
            int cnt=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    set.add(ch);
                    maxcnt=Math.max(maxcnt,set.size());
                }
                else{
                    break;
                }
            }
        }
        return maxcnt;
    }
}