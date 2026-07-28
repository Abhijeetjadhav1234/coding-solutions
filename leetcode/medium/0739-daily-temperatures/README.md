# Daily Temperatures

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `temperatures` represents the daily temperatures, return  *an array*  `answer`  *such that*  `answer[i]`  *is the number of days you have to wait after the*  `ith`  *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

 **Example 1:** 

```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

```

 **Example 2:** 

```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

```

 **Example 3:** 

```
Input: temperatures = [30,60,90]
Output: [1,1,0]

```

 

 **Constraints:** 

- 1 <= temperatures.length <= 105
- 30 <= temperatures[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 80 ms (beats 10.13%)  
**Memory:** 106.8 MB (beats 54.81%)  
**Submitted:** 2026-07-28T05:50:33.708Z  

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] ans=new int[n];
        Arrays.fill(ans,0);
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
            st.pop();
           }
           if(!st.isEmpty()){
            ans[i]=st.peek()-i;
           }
           st.push(i);
        
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/daily-temperatures/)