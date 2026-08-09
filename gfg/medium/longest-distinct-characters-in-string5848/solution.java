class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxcnt=0;
        int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int rigth=0;rigth<s.length();rigth++){
            char ch=s.charAt(rigth);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                left++;
            }
            maxcnt=Math.max(maxcnt,rigth-left+1);
        }
        return maxcnt;
    }
}