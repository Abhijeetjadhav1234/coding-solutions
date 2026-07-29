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
**Runtime:** 7 ms (beats 99.43%)  
**Memory:** 48.5 MB (beats 24.81%)  
**Submitted:** 2026-07-29T09:02:03.778Z  

```java
class Solution {
    public int calculate(String s) {
       List<Integer>nums=new ArrayList<>();
       List<Character>ops= new ArrayList<>();

       int num=0;
       for(char ch:s.toCharArray()){
        if(ch==' ')
        continue;

        if(Character.isDigit(ch)){
            num=num*10+(ch-'0');
        }
        else{
            nums.add(num);
            ops.add(ch);
            num=0;
        }
       } 
       nums.add(num);

       for (int i = 0; i < ops.size(); ) {
    if (ops.get(i) == '*' || ops.get(i) == '/') {
        int a = nums.get(i);
        int b = nums.get(i + 1);

        int val = (ops.get(i) == '*') ? a * b : a / b;

        nums.set(i, val);
        nums.remove(i + 1);
        ops.remove(i);
    } else {
        i++;
    }
}
       int result=nums.get(0);
       for(int i=0;i<ops.size();i++){
        if(ops.get(i)=='+'){
            result+=nums.get(i+1);
        }
        else{
            result-=nums.get(i+1);
        }
       }
       return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/basic-calculator-ii/)