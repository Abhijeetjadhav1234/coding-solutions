# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 1173 ms (beats 5.07%)  
**Memory:** 48.5 MB (beats 5.23%)  
**Submitted:** 2026-08-04T12:36:41.272Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(1==s.length())
        return 1;

        int maxcount=0;
       
        for(int i=0;i<s.length();i++){
             Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    set.add(ch);
                    maxcount=Math.max(maxcount,set.size());
                    
                }
                else{
                    break;
                }
                

            }
        }
        return maxcount;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)