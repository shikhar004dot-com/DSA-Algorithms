# Stack Implementation in Java

---

## 🔎 About Stack
A **stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
- The element inserted last is the first one to be removed.  
- Think of it like a stack of plates: you add plates on top, and you remove from the top.

---

## Stack.java
- This file defines the Stack class (your data structure).

- It contains:

- Fields (top, size, st[]) → the internal state of the stack.

- Methods (push, pop, peek, isEmpty, isFull, display) → the operations you can perform on the stack.

---

## StackClient.java
- This file defines the driver program (the client).

- It contains the main() method, which is the entry point of your Java application.

- It creates an object of the Stack class and calls its methods to demonstrate functionality.

---

## Features
- **Push** → Insert an element at the top of the stack.
- **Pop** → Remove and return the top element.
- **Peek** → View the top element without removing it.
- **Overflow Handling** → Prevents pushing when the stack is full.
- **Underflow Handling** → Prevents popping when the stack is empty.

---

##  Example Code

### stack.java
```java
class stack {
    int top = -1;
    int size = 5;
    int[] st = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Overflow");
        } else {
            st[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return st[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return st[top];
    }
}
```

---

### stack_client

``` java
class stack_client{  // defines a class name stack_client
    public static void main(String[] args) {
        stack st=new stack();  // our custom class

        st.push(10);  //top=-1-->0  st[0]=10
        st.push(20);  //top=1 --> st[1]=20
        st.push(30);  //top=2 -->st[2]=30
        st.push(40);  //top=3 -->st[3]=40  this will be at the top of the stack
        System.out.println(st.peek()); // returns top element

    }

    // stack--> our custom class (from stack.java)
    //st--> reference variable
    //new stack()--> creates object in memory

// st---> stack object
        //top=-1
        //st=[_,_,_,_,_]

        
} 
```

---

### dry run

Push(10): top = 0 → [10, _, _, _, _]
Push(20): top = 1 → [10, 20, _, _, _]
Push(30): top = 2 → [10, 20, 30, _, _]
Push(40): top = 3 → [10, 20, 30, 40, _]

Peek(): returns 40

---

### Time & Space Complexity
* Push: O(1)

* Pop: O(1)

* Peek: O(1)

* Space Complexity: O(n) (where n is the stack size)


