# Sorting Algorithms

This folder contains implementations of sorting algorithms in Java.

---

## Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are compared and swapped if they are in the wrong order.

After each pass, the largest element moves to the end of the array — just like a bubble rising to the surface.

---

### How It Works

* Compare adjacent elements (`arr[j]` and `arr[j+1]`)
* Swap if they are in the wrong order
* Repeat for all elements
* After each iteration, the largest element is placed at the end
* Reduce the range of comparison (`n - i - 1`)

---

### Time Complexity

| Case       | Complexity |
| ---------- | ---------- |
| Best Case  | O(n²)      |
| Average    | O(n²)      |
| Worst Case | O(n²)      |

---

### Space Complexity

* O(1) → In-place sorting

---

### Example

**Input:**

```id="input"
[2, 3, 1, 4, 6, 8, 5]
```

**Output:**

```id="output"
[1, 2, 3, 4, 5, 6, 8]
```

---

### Java Implementation

```java id="code"
public static int[] bubbleSort(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}
```

---

### Note

* This is the **basic version** of Bubble Sort
* It always runs in O(n²), even if the array is already sorted

---

### Possible Optimization

* Add a `swapped` flag to stop early if no swaps occur
* This improves best-case time complexity to **O(n)**

---

### When to Use

* Learning and understanding sorting concepts
* Small datasets
* Academic purposes

---
