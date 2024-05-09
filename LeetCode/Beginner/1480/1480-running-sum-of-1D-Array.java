class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i -1];
        }
        return results;
    }

    // time complexity = O(n)
    // space complexity = 0(n) -> we declare an array `results` of size `n` to store the running 
    // sum and access the previous value to calculate the next value.
}

// Overwritten Input Complexity
class Solution2 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }

    // time complexity = 0(n)
    // space complexity = O(1)

}