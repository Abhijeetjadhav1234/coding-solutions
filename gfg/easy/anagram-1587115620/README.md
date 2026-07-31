# Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-empty strings  **s1** and  **s2**, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

 **Examples:** 

```
Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
```

```
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
```

```
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
```

 **Constraints:** 
1 ≤ s1.size(), s2.size() ≤ 105
s1, s2 consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-31T16:25:02.958Z  

```java
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer>a1=new HashMap<>();
        HashMap<Character,Integer>a2=new HashMap<>();
        for(char ch:s1.toCharArray()){
            a1.put(ch,a1.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            a2.put(ch,a2.getOrDefault(ch,0)+1);
        }
        
        return a1.equals(a2);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/anagram-1587115620/1)