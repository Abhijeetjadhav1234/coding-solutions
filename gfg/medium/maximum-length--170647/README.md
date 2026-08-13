# Maximum Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the exact number of occurrences of characters  **'a'**,  **'b'**, and  **'c'**, find if it is possible to construct a string using all the given characters such that no three consecutive characters are the same.

 **Examples:** 

```
Input: a = 3, b = 3, c = 3
Output:  true
Explanation: One possible string is "abcabcabc", which uses all characters and contains no three consecutive identical characters.
```

```
Input: a = 11, b = 2, c = 2
Output: false
Explanation: The number of 'a' characters is too large to separate using the available 'b' and 'c' characters, so at least one occurrence of "aaa" is unavoidable.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T13:09:26.358Z  

```java
class Solution {
    public boolean isPossible(int a, int b, int c) {
        // code here
        int maxnum=0;
        int n1=0;
        int n2=0;
        if(a>b && a>c){
            maxnum=a;
            n1=b+c;
            
        }
        if(b>a && b>c){
            maxnum=b;
            n1=a+c;;
        }
        if(c>b && c>a){
            maxnum=c;
            n1=b+a;
        }
        if (maxnum > 2 * (n1 + 1)) {
            return false;
        }

        return true;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-length--170647/1)