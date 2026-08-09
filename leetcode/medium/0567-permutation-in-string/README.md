# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 793 ms (beats 5.05%)  
**Memory:** 46.8 MB (beats 21.11%)  
**Submitted:** 2026-08-09T09:58:23.413Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int n=s1.length();
          int n2=s2.length();
                  if (n > n2) {
            return false;
        }

          HashMap<Character,Integer>mp1=new HashMap<>();

          for(char c:s1.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
          }
          for(int i=0;i<=n2-n;i++){
                HashMap<Character,Integer>mp2=new HashMap<>();
                for(int j=i;j<n+i;j++){
                    char ch=s2.charAt(j);
                    mp2.put(ch,mp2.getOrDefault(ch,0)+1);
                    
                }
                if(mp1.equals(mp2)){
                            return true;
                        }    
          }
          return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)