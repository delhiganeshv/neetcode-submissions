class Solution {
    public void sortColors(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int[] count = new int[3];

        for(int num : nums) {
            ++count[num];
        }

        int numsIndex = 0;
        for(int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[numsIndex++] = i;
            }
        }
    }
}