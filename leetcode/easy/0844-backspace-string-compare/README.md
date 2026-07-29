# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 59.83%)  
**Memory:** 42.9 MB (beats 67.06%)  
**Submitted:** 2026-07-29T13:36:29.655Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)