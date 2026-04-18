# 🔍 Searching Algorithms

This folder contains implementations of various searching algorithms in Java.

---

## Algorithms Included

* Binary Search
* Linear Search

---

## 🔹 Binary Search

### Definition

Binary Search is an efficient algorithm used to find an element in a **sorted array** by repeatedly dividing the search space into halves.

---

### How It Works

* Find the middle element
* Compare with target:

  * If equal → return index
  * If smaller → search right half
  * If larger → search left half
* Repeat until found or range becomes empty

---

### Example

Array: `[1, 3, 4, 6, 7, 13, 14, 16]`
Target: `13`

Steps:

1. Middle = 6 → move right
2. Middle = 13 → found

---

### Algorithm

1. Set `low = 0`, `high = n - 1`
2. Calculate `mid = low + (high - low) / 2`
3. Compare:

   * If equal → return index
   * If smaller → move right
   * If larger → move left
4. Repeat until found

---

###  Time Complexity

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

---

### Important

Binary Search works **only on sorted arrays**

---

---

## 🔹 Linear Search

### Definition

Linear Search is a simple algorithm that checks each element of the array one by one until the target element is found.

---

### How It Works

* Start from the first element
* Compare each element with the target
* If match is found → return index
* If not found → return -1

---

### Example

Array: `[2, 3, 1, 4, 5, 6]`
Target: `4`

Steps:

1. Compare 2 → not match
2. Compare 3 → not match
3. Compare 1 → not match
4. Compare 4 → found 

---

### Algorithm

1. Traverse array from index 0 to n-1
2. If `arr[i] == key` → return index
3. If loop ends → return -1

---

###  Time Complexity

* Best Case: O(1)
* Average Case: O(n)
* Worst Case: O(n)

---

### When to Use

* When array is **unsorted**
* When dataset is **small**
* When simplicity is preferred

---

### Java Code

```java
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) {
            return i;
        }
    }
    return -1;
}
```

---

## Jump Search

### Definition

Jump Search is an algorithm for searching in a **sorted array** by jumping ahead by fixed steps and then performing a linear search within the identified block.

---

### How It Works

* Jump ahead by √n steps
* Find the block where the element may exist
* Perform linear search in that block

---

### Example

Array: `[1, 3, 4, 6, 7, 13, 14, 16]`
Target: `13`

Steps:

1. Jump to index 2 → value 4
2. Jump to index 4 → value 7
3. Jump to index 6 → value 14 (crossed target)
4. Linear search between previous block → found 

---

### Algorithm

1. Calculate step = √n
2. Jump in blocks until element exceeds key
3. Perform linear search in that block

---

### Time Complexity

* Best Case: O(1)
* Average Case: O(√n)
* Worst Case: O(√n)

---

### Important

Works only on **sorted arrays**

---

### Java Code

```java
public static int jumpSearch(int[] arr, int key) {
    int n = arr.length;
    int step = (int)Math.sqrt(n);
    int prev = 0;

    while (arr[Math.min(step, n) - 1] < key) {
        prev = step;
        step += (int)Math.sqrt(n);
        if (prev >= n)
            return -1;
    }

    while (arr[prev] < key) {
        prev++;
        if (prev == Math.min(step, n))
            return -1;
    }

    if (arr[prev] == key)
        return prev;

    return -1;
}
```

