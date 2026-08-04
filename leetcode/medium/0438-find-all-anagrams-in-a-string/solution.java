class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer>ans=new ArrayList<>();
       HashMap<Character,Integer>pcount=new HashMap<>();
       HashMap<Character,Integer>scount=new HashMap<>();
       int left=0;
       int count=p.length();
       for(char ch:p.toCharArray()){
        pcount.put(ch,pcount.getOrDefault(ch,0)+1);
       }
       for(int rigth=0;rigth<s.length();rigth++){
        char c=s.charAt(rigth);
        scount.put(c,scount.getOrDefault(c,0)+1);
        if(pcount.containsKey(c) && scount.get(c)<=pcount.get(c)){
            count--;
        }
        if(rigth-left+1>p.length()){
            char lc=s.charAt(left);
            if(pcount.containsKey(lc) && scount.get(lc)<=pcount.get(lc)){
                count++;
            }
            scount.put(lc,scount.get(lc)-1);
            left++;
        }
        if(count==0){
            ans.add(left);
        }
       } 
       return ans;
    }
}