class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer>a1=new HashMap<>();
        HashMap<Character,Integer>a2=new HashMap<>();
        for(char ch:s1.toCharArray()){
            a1.put(ch,a1.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            a2.put(ch,a2.getOrDefault(ch,0)+1);
        }
        
        return a1.equals(a2);
        
    }
}