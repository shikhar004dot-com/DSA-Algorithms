# Kadane's Algorithm
---
* Kadane’s Algorithm is used to find the **maximum sum of a contiguous subarray** in an array.  
* It solves the problem efficiently in **O(n)** time using a greedy approach.
---

# Intuition
---
* At every step, we decide whether to:
  * **Continue the current subarray**
  * **Start a new subarray**
* If the running sum becomes negative, we reset it to `0`.
---

# Step-by-Step Algorithm
---
* **Step 1: Initialize**
  * `sum = 0`
  * `res = Integer.MIN_VALUE`

* **Step 2: Traverse the array**
  * Add the current element to `sum`
  * Update result: `res = Math.max(res, sum)`
  * If `sum < 0`, reset `sum = 0`

* **Step 3: Return the result**
  * After the loop ends, `res` will hold the maximum subarray sum.
---

# Example Input
---
* `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
---

# Example Output
---
* `6`
---

# Explanation
---
* Maximum subarray → `[4, -1, 2, 1]`  
* Sum → `6`
---

# Dry Run
---
* Step 1 → Element = -2 → Current Sum = 0 → Max Result = -2  
* Step 2 → Element = 1 → Current Sum = 1 → Max Result = 1  
* Step 3 → Element = -3 → Current Sum = 0 → Max Result = 1  
* Step 4 → Element = 4 → Current Sum = 4 → Max Result = 4  
* Step 5 → Element = -1 → Current Sum = 3 → Max Result = 4  
* Step 6 → Element = 2 → Current Sum = 5 → Max Result = 5  
* Step 7 → Element = 1 → Current Sum = 6 → Max Result = 6  
* Step 8 → Element = -5 → Current Sum = 1 → Max Result = 6  
* Step 9 → Element = 4 → Current Sum = 5 → Max Result = 6  

* Final Answer → **6**
---

# Complexity
---
* **Time Complexity:** O(n)  
* **Space Complexity:** O(1)
---

# Edge Case
---
* Kadane’s Algorithm works even when **all elements are negative**  
* Because `res` is initialized as `Integer.MIN_VALUE`
---

# Java Implementation
---
```java
class Kadanes_algo {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Maximum_Sum(arr));
    }

    public static int Maximum_Sum(int arr[]) {
        int res = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return res;
    }
}
