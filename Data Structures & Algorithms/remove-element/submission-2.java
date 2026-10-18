class Solution {
    public int removeElement(int[] nums, int val) {
        int resultLen = 0;

        for(int num : nums) {
            if (num != val) {
                nums[resultLen++] = num;
            }
        }
        return resultLen;
    }
}