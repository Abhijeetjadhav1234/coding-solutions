# Basic Calculator II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` which represents an expression,  *evaluate this expression and return its value*. 

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of `[-231, 231 - 1]`.

 **Note:**  You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.

 

 **Example 1:** 

```
Input: s = "3+2*2"
Output: 7

```

 **Example 2:** 

```
Input: s = " 3/2 "
Output: 1

```

 **Example 3:** 

```
Input: s = " 3+5 / 2 "
Output: 5

```

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
- s represents a valid expression.
- All the integers in the expression are non-negative integers in the range [0, 231 - 1].
- The answer is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 98.17%)  
**Memory:** 48.5 MB (beats 26.32%)  
**Submitted:** 2026-08-23T09:13:52.247Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/basic-calculator-ii/)