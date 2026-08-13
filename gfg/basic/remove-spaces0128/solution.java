class Solution {
    public String removeSpaces(String s) {
        // code here
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}