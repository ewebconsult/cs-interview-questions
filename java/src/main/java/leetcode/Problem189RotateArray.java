package leetcode;

/**
 * https://leetcode.com/problems/rotate-array
 */
public final class Problem189RotateArray {
    // Time - O(N), Space - O(1)?
    public void rotate(int[] nums, int k) {
        if (nums == null || k < 0) {
            return;
        }

        if (k > nums.length) {
            k %= nums.length;
        }

        int[] result = new int[nums.length];
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j++];
        }

        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
