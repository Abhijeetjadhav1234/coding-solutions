# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 45 ms (beats 26.25%)  
**Memory:** 47.5 MB (beats 23.41%)  
**Submitted:** 2026-08-04T12:07:13.099Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer>ans=new ArrayList<>();
       HashMap<Character,Integer>pcount=new HashMap<>();
       HashMap<Character,Integer>scount=new HashMap<>();
       int left=0;
       int count=p.length();
       for(char ch:p.toCharArray()){
        pcount.put(ch,pcount.getOrDefault(ch,0)+1);
       }
       for(int rigth=0;rigth<s.length();rigth++){
        char c=s.charAt(rigth);
        scount.put(c,scount.getOrDefault(c,0)+1);
        if(pcount.containsKey(c) && scount.get(c)<=pcount.get(c)){
            count--;
        }
        if(rigth-left+1>p.length()){
            char lc=s.charAt(left);
            if(pcount.containsKey(lc) && scount.get(lc)<=pcount.get(lc)){
                count++;
            }
            scount.put(lc,scount.get(lc)-1);
            left++;
        }
        if(count==0){
            ans.add(left);
        }
       } 
       return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)