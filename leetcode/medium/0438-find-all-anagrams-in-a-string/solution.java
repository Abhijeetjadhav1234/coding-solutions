class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        int[] pcount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int i=0;i<=n-k;i++){
            int[] count=new int[26];
            for(int j=i;j<i+k;j++){
                char ch=s.charAt(j);
                count[ch-'a']++;
            }
            if(Arrays.equals(count,pcount)){
                ans.add(i);
            }
        }
        return ans;
    }
}