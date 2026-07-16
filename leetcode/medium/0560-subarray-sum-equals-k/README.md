# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 93.84%)  
**Memory:** 48.9 MB (beats 33.91%)  
**Submitted:** 2026-07-16T06:54:52.111Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int num:nums){
            prefixSum+=num;
            if(map.containsKey(prefixSum-k)){
                 count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)