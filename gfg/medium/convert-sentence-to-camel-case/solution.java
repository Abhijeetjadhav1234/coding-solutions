class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        boolean isMatch=false;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' '){
                isMatch=true;
            }
            else if(isMatch==true){
                res.append(Character.toUpperCase(s.charAt(i)));
                isMatch=false;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}