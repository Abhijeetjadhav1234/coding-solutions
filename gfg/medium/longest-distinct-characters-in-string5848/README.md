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
**Submitted:** 2026-08-09T07:49:17.614Z  

```java
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxcnt=0;
        int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int rigth=0;rigth<s.length();rigth++){
            char ch=s.charAt(rigth);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                left++;
            }
            maxcnt=Math.max(maxcnt,rigth-left+1);
        }
        return maxcnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1)