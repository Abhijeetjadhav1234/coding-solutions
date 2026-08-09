# Longest Substring with Distinct Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, find the length of the longest substring with all distinct characters. 

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest substring with all distinct characters.

```

```
Input: s = "aaa"
Output: 1
Explanation: "a" is the longest substring with all distinct characters.

```

```
Input: s = "abcdefabcbb"
Output: 6
Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-09T07:24:30.407Z  

```java
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxcnt=0;
        for(int i=0;i<s.length();i++){
            Set<Character>set=new TreeSet<>();
            int cnt=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!set.contains(ch)){
                    set.add(ch);
                    maxcnt=Math.max(maxcnt,set.size());
                }
                else{
                    break;
                }
            }
        }
        return maxcnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1)