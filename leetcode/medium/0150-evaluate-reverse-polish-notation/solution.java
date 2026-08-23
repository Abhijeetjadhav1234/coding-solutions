class Solution {
    public int evalRPN(String[] tokens) {
        List<String>l=new ArrayList<>(Arrays.asList(tokens));
        while(l.size()>1){
            for(int i=0;i<l.size();i++){
                String t=l.get(i);
                if(t.equals("+") || t.equals("-") || t.equals("*")|| t.equals("/")){
                    int b=Integer.parseInt(l.get(i-1));
                    int a=Integer.parseInt(l.get(i-2));
                    int val=0;
                    if(t.equals("+"))val=a+b;
                    else if(t.equals("-"))val=a-b;
                    else if(t.equals("*"))val=a*b;
                    else val=a/b;
                    
                    l.set(i-2,String.valueOf(val));
                    l.remove(i);
                    l.remove(i-1);
                    break;
                }
            }
        }

        return Integer.parseInt(l.get(0));
    }
}