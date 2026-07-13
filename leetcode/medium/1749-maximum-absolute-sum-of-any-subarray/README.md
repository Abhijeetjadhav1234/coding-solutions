# Maximum Absolute Sum of Any Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`. The  **absolute sum**  of a subarray `[numsl, numsl+1,..., numsr-1, numsr]` is `abs(numsl + numsl+1 +... + numsr-1 + numsr)`.

Return  *the  **maximum**  absolute sum of any  **(possibly empty)**  subarray of* `nums`.

Note that `abs(x)` is defined as follows:

- If x is a negative integer, then abs(x) = -x.
- If x is a non-negative integer, then abs(x) = x.

 

 **Example 1:** 

```
Input: nums = [1,-3,2,3,-4]
Output: 5
Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.

```

 **Example 2:** 

```
Input: nums = [2,-5,1,-4,3,-2]
Output: 8
Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 92.08%)  
**Memory:** 67 MB (beats 28.70%)  
**Submitted:** 2026-07-13T11:59:56.865Z  

```java
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int currpsum=0;
        int currnsum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            currpsum+=nums[i];
            maxsum=Math.max(currpsum,maxsum);
            if(currpsum<0){
                currpsum=0;
            }
            currnsum+=nums[i];
            minsum=Math.min(currnsum,minsum);
            if(currnsum>0){
                currnsum=0;
            }
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/)