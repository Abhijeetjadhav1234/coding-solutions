class Solution {
    public int calculate(String s) {
        List<Integer>d=new ArrayList<>();
        List<Character>o=new ArrayList<>();
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else{
                d.add(num);

                o.add(ch);
                num=0;
            }
        }
        d.add(num);

        for(int i=0;i<o.size();){
        if(o.get(i)=='*' || o.get(i)=='/'){
            int a=d.get(i);
            int b=d.get(i+1);
            int val=(o.get(i)=='*')?a*b:a/b;
            o.remove(i);
            d.set(i,val);
            d.remove(i+1);

        }
        else{
            i++;
        }
        
        }
        int result=d.get(0);
        for(int i=0;i<o.size();i++){
            if(o.get(i)=='+'){
            result+=d.get(i+1);}
            else{
            result-=d.get(i+1);
            }
        }
        return result;

    }
}