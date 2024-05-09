## Context

Given an integer `num`, return the number of steps to reduce it to zero

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Constraints:

- 0 <= num <= 10^6

### Understanding The Question

```
6 / 2 = 3 <-- halving step

3 - 1 = 2 <-- subtraction step

2 / 2 = 1

1 - 1 = 0

Total steps = 4
```

### Approach One Complexities:

Time Complexity: O(logn)

![alt text](<Screenshot by Dropbox Capture.png>)

total = 2logn

Time Complexity: O(logn)

Space Complexity: O(1)


### Bitwise Approach

- Binary representation of integers
-  00011110

![alt text](<Screenshot by Dropbox Capture-1.png>)

![alt text](<Screenshot by Dropbox Capture-2.png>)

Time Complexity: O(logn)
Space Complexity: O(1)