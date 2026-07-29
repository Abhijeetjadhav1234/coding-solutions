class Solution {
    public boolean backspaceCompare(String s, String t) {
        return builds(s).equals(builds(t));
    }

    public String builds(String str){
        Stack<Character>stack=new Stack<>();
                for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder ans=new StringBuilder();
        for(char ch:stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}