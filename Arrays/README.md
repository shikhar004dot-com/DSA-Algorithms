# Kadane's Algorithm

Kadane’s Algorithm is used to find the maximum sum of a contiguous subarray in an array.
It solves the problem efficiently in O(n) time using a greedy approach.

## Intuition

At every step, we decide:

Continue the current subarray
Start a new subarray

If the running sum becomes negative, we reset it to 0.

---

### Algorithm Steps

Initialize:
sum = 0
res = Integer.MIN_VALUE
Traverse the array:
Add element to sum
Update res = Math.max(res, sum)
If sum < 0, reset it to 0

---

Input
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

---

Output
6
Explanation
Maximum subarray → [4, -1, 2, 1]
Sum → 6

---

### Time Complexity → O(n)
--- 
### Space Complexity → O(1)
---
### Edge Case
Works even when all elements are negative
Because res = Integer.MIN_VALUE