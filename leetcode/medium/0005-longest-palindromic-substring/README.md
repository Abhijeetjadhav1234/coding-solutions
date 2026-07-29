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
**Runtime:** 1867 ms (beats 7.29%)  
**Memory:** 43.7 MB (beats 49.73%)  
**Submitted:** 2026-07-29T05:05:53.983Z  

```java
class Solution {
    public boolean checkp(String s,int f,int l){
        while(f<=l){
            if(s.charAt(f)!=s.charAt(l)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
    
    public String longestPalindrome(String s) {
        String ans;
        int[] arr=new int[s.length()];
        int maxcnt=0;
        int sf=0;
        int ff=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++)
            if(checkp(s,i,j)){
             if(maxcnt<j-i+1){
                maxcnt = j - i + 1; 
                  sf=i;
                  ff=j;
             }
            }
        }
         return s.substring(sf,ff+1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)