class Solution {
    public int removeDuplicates(int[] nums) {
        int newLength = 1;

        for(int oldIndex = 1; oldIndex < nums.length; oldIndex++) {
            if (nums[oldIndex - 1] < nums[oldIndex]) {
                nums[newLength++] = nums[oldIndex];
            }
        }
        return newLength;
    }
}