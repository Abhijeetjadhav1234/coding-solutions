# Longest Substring with K Uniques

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  consisting only lowercase alphabets and an integer  **k**. Your task is to find the  **length** of the  **longest substring**  that contains exactly  **k**  distinct characters.

 **Note :**  If no such substring exists, return  **-1**. 

 **Examples:** 

```
Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

```

```
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.

```

```
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105
1 ≤ k ≤ 26

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-09T08:27:48.414Z  

```java
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int maxcnt=-1;
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        for(int rigth=0;rigth<s.length();rigth++){
            char ch=s.charAt(rigth);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                if (map.get(cl) == 0) {
                    map.remove(cl);
                }


                left++;
            }
            if(map.size()==k){
                maxcnt=Math.max(maxcnt,rigth-left+1);
            }
        }
        return maxcnt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)