# Evaluate Reverse Polish Notation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of strings `tokens` that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return  *an integer that represents the value of the expression*.

 **Note**  that:

- The valid operators are '+', '-', '*', and '/'.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in a reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

 

 **Example 1:** 

```
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

```

 **Example 2:** 

```
Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

```

 **Example 3:** 

```
Input: tokens = ["10","6","9","3","+","-11"," *","/","* ","17","+","5","+"]
Output: 22
Explanation: ((10  *(6 / ((9 + 3)*  -11))) + 17) + 5
= ((10  *(6 / (12*  -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

```

 

 **Constraints:** 

- 1 <= tokens.length <= 104
- tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

## Solution

**Language:** Java  
**Runtime:** 579 ms (beats 5.50%)  
**Memory:** 47 MB (beats 5.72%)  
**Submitted:** 2026-08-23T13:01:22.544Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/)