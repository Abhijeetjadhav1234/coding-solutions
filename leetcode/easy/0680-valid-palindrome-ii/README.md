# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 99.02%)  
**Memory:** 47.9 MB (beats 12.07%)  
**Submitted:** 2026-08-01T13:32:32.154Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)!=s.charAt(h)){
                return isPalindrome(s,l+1,h) || 
                isPalindrome(s,l,h-1);
            }
            l++;
            h--;
        }
        return true;
    }

    public boolean isPalindrome(String st, int f,int e){
        while(f<=e){
            if(st.charAt(f)!=st.charAt(e)){
                return false;
            }
            f++;
            e--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)