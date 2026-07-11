# Kadane's Algorithm

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array  **arr[].**  You need to find the  **maximum**  sum of a subarray (containing at least one element) in the array  **arr[]**.

 **Note :** A   subarray   is a continuous part of an array.

 **Examples:** 

```
Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

```

```
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
```

```
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
```

**Constraints:
**1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-11T12:05:48.087Z  

```java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int ans=arr[0];
        int best=arr[0];
        
        for(int i=1;i<arr.length;i++){
           
            int v2=arr[i]+best;
            best=Math.max(arr[i],v2);
            ans=Math.max(ans,best);
        }
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)