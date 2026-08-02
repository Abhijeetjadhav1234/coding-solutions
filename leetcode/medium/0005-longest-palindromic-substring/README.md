# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 1543 ms (beats 11.90%)  
**Memory:** 43.8 MB (beats 45.23%)  
**Submitted:** 2026-08-02T17:07:08.902Z  

```java
class Solution {
    public boolean palindrome(String str, int lv,int hv){
        while(lv<=hv){
            if(str.charAt(lv)!=str.charAt(hv))
            return false;

            lv++;
            hv--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxcnt=0;
        int ls=0;
        int hs=0;
        for(int i=0;i<s.length();i++){
            
            for(int j=i+1;j<s.length();j++){
                if(palindrome(s,i,j)){
                    if(maxcnt<j-i+1){
                        maxcnt=j-i+1;
                        ls=i;
                        hs=j;
                    }

                }
            }
        }
        return s.substring(ls,hs+1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)