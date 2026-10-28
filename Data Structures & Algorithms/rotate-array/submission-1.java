class Solution {
    public void rotate(int[] nums, int k) {
        int numsLen = nums.length;
        int normalizedK = k % numsLen;

        for(int i = 0; i < normalizedK; i++) {
            int rotateValue = nums[numsLen - 1];

            for(int j = numsLen - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = rotateValue;
        }
    }
}