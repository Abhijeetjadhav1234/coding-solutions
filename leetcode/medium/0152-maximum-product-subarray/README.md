# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find a subarray that has the largest product, and return  *the product*.

The test cases are generated so that the answer will fit in a  **32-bit**  integer.

 **Note**  that the product of an array with a single element is the value of that element.

 

 **Example 1:** 

```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

```

 **Example 2:** 

```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -10 <= nums[i] <= 10
- The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 70.89%)  
**Memory:** 46.9 MB (beats 94.30%)  
**Submitted:** 2026-07-12T12:24:15.864Z  

```java
class Solution {
    public int maxProduct(int[] nums) {
      int prefix=1;
      int sufix=1;
      int ans=nums[0];
      int n=nums.length;
      for(int i=0;i<nums.length;i++){
        if(prefix==0)prefix=1;
        if(sufix==0)sufix=1;
        prefix*=nums[i];
        sufix*=nums[n-i-1];
        int current=Math.max(prefix,sufix);
        ans=Math.max(ans,current);
      }  
      return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-subarray/)