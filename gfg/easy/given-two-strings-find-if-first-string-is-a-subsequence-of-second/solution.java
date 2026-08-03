class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int j=0;
        int i=0;
        int cnt=0;
        while(i<s1.length()){
            char ch=s1.charAt(i);
            while(j<s2.length()){
                if(s2.charAt(j)==ch){
                cnt++;
                break;}
                j++;
            }
            i++;
        }
        if(cnt==s1.length())
        return true;
        
        return false;
    }
};