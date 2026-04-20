# Sorting Algorithms

This folder contains implementations of sorting algorithms in Java.

---

# Bubble Sort

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

# Selection Sort

Selection Sort is a simple comparison-based sorting algorithm that repeatedly selects the smallest element from the unsorted part of the array and places it at the correct position.

---

### How It Works

* Start from index `i = 0`
* Assume current index is the minimum (`minIdx = i`)
* Compare it with the rest of the array
* Find the smallest element
* Swap it with the current index
* Repeat for all elements

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
[1, 2, 3, 2, 5, 7, 8, 5, 10]
```

**Output:**

```id="output"
[1, 2, 2, 3, 5, 5, 7, 8, 10]
```

---

### Java Implementation

```java id="code"
public static int[] selectionSort(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
        int minidx = i;

        for(int j = i + 1; j < arr.length; j++) {
            if(arr[j] < arr[minidx]) {
                minidx = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minidx];
        arr[minidx] = temp;
    }
    return arr;
}
```

---

### Advantages

* Simple and easy to implement
* Performs minimum number of swaps
* Works well for small datasets

---

### Disadvantages

* Inefficient for large datasets
* Time complexity is always O(n²)
* Not stable (may change order of equal elements)

---

### When to Use

* When memory is limited (in-place sorting)
* For small datasets
* For learning sorting concepts

---

# Insertion Sort

Insertion Sort builds the sorted array one element at a time by inserting elements into their correct position.

It works like sorting playing cards in your hand.

---

## How It Works
Start from second element
Compare with left side
Shift larger elements
Insert element at correct position

---  

## Time Complexity
Case	Complexity
Best	O(n)
Average	O(n²)
Worst	O(n²)

---  

## Space Complexity
O(1) → In-place

---

## Step-by-Step Dry Run

Let’s sort:

[5, 3, 4, 1, 2]
Step 1


Take 3, compare with 5, insert before it:

[3, 5, 4, 1, 2]
Step 2


Take 4, place between 3 and 5:

[3, 4, 5, 1, 2]
Step 3


Take 1, shift everything right:

[1, 3, 4, 5, 2]
Step 4


Take 2, place after 1:

[1, 2, 3, 4, 5]
