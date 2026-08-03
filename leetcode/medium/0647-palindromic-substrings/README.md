# Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the number of  **palindromic substrings**  in it*.

A string is a  **palindrome**  when it reads the same backward as forward.

A  **substring**  is a contiguous sequence of characters within the string.

 

 **Example 1:** 

```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

```

 **Example 2:** 

```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-03T07:34:41.598Z  

```java
class Solution {
    public boolean palindrome(String str, int i,int j){
        while(i>=0 && j<str.length()){
          if(str.charAt(i)!=str.charAt(j))
          return false;
          i--;
          j++;
        }
        return true;
    }
    public int countSubstrings(String s) {
        if(s.length()==1){
            return 1;
        }
        int cnt=0;
        for(int i=0;i<s.length();i++){
        
                if(palindrome(s,i,i)){
                    cnt++;
                }
                if(palindrome(s,i,i+1)){
                    cnt++;
                }
            }
        
        return cnt;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-substrings/)