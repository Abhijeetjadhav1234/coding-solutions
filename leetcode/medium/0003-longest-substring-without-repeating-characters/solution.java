class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(1==s.length())
        return 1;
        int maxcount=0;
       
        for(int i=0;i<s.length();i++){
             Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    maxcount=Math.max(maxcount,set.size());
                    break;
                }
                set.add(ch);

            }
        }
        return maxcount;
    }
}