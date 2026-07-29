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
**Runtime:** 22 ms (beats 61.72%)  
**Memory:** 48.1 MB (beats 56.57%)  
**Submitted:** 2026-07-29T09:32:38.195Z  

```java
class Solution {
    public int calculate(String s) {
        Stack<Integer>stack=new Stack<>();
        int num=0;
        char op='+';
        for(int i=0;i<=s.length();i++){
        char ch =(i==s.length())?'+':s.charAt(i);
        if(Character.isDigit(ch)){
            num=num*10+(ch-'0');
        }
        else if(ch!=' '){
            if(op=='+'){
                stack.push(num);
            }
            else if(op=='-'){
                stack.push(-num);
            }
            else if(op=='*'){
                stack.push(stack.pop()*num);
            }
            else if(op=='/'){
                stack.push(stack.pop()/num);
            }
            op=ch;
            num=0;
        }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/basic-calculator-ii/)