class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer>s=new Stack<>();
        for(String t:tokens){
            if(t.equals("+") || t.equals("/") ||t.equals("*")||t.equals("-")){
            int b=s.pop();
            int a=s.pop();
            int val=0;
            if(t.equals("+"))val=a+b;
            else if(t.equals("-"))val=a-b;
            else if(t.equals("*"))val=a*b;
            else val=a/b;
            s.push(val);}
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.peek();
    }
}