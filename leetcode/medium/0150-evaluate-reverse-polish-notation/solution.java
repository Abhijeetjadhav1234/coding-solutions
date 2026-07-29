class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(String t:tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                int val=0;
                if (t.equals("+"))
                    val = b + a;
                else if (t.equals("-"))
                    val = b - a;
                else if (t.equals("*"))
                    val = b * a;
                else
                    val = b / a;

                stack.push(val);
                            }
                            else{
                                stack.push(Integer.parseInt(t));
                            }
        }

        return stack.peek();
    }
}