# 🔍 Searching Algorithms

This folder contains implementations of various searching algorithms in Java.

---

## Algorithms Included

* Binary Search

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

### Java Implementation

