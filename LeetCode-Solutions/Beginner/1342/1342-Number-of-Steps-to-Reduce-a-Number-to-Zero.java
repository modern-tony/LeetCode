class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; // num = num / 2;
            } else {
                // remainder is 1
                num--; // num = num - 1;
            }
            steps++; // increment steps
        }
        return steps;
    }

    // Time Complexity = O(log n)
    // Space Complexity = O(1)
}


// Bitwise Approach
class Solution2 {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            // Before we used num % 2
            if ((num & 1)  == 0) { // num: xxxxxxx0 & bitmask: 00000001
                // Before we used num /= 2
                num = num >> 1;
                // or num >>= 1;
            } else {
                // remainder is 1
                num--; // num = num - 1;
            }
            steps++; // increment steps
        }
        return steps;
    }

    // Time Complexity = O(log n)
    // Space Complexity = O(1)
}