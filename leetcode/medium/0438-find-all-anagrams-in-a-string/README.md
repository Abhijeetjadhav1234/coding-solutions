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
**Runtime:** 360 ms (beats 11.38%)  
**Memory:** 46.9 MB (beats 46.74%)  
**Submitted:** 2026-08-04T03:56:23.686Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        int[] pcount=new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        for(int i=0;i<=n-k;i++){
            int[] count=new int[26];
            for(int j=i;j<i+k;j++){
                char ch=s.charAt(j);
                count[ch-'a']++;
            }
            if(Arrays.equals(count,pcount)){
                ans.add(i);
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)