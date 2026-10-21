class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int maxLength = 1;
        int currentLength = 1;

        for(int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff > 1) {
                maxLength = maxLength < currentLength ? currentLength : maxLength;
                currentLength = 1;
            } else if (diff == 1) {
                currentLength++;
            }
        }

        return maxLength < currentLength ? currentLength : maxLength;
    }
}
