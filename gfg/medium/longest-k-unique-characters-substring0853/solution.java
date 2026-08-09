class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int maxcnt=-1;
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        for(int rigth=0;rigth<s.length();rigth++){
            char ch=s.charAt(rigth);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                if (map.get(cl) == 0) {
                    map.remove(cl);
                }


                left++;
            }
            if(map.size()==k){
                maxcnt=Math.max(maxcnt,rigth-left+1);
            }
        }
        return maxcnt;
    }
}