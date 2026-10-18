class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
         int i = 0, j = 0;

        while(i < nums.length) {
            if (nums[i] == val) {
                j = i;
                while(j < nums.length && nums[j] == val) {
                    j++;
                }
                break;
            }
            i++;
        }

        while(j > 0 && j < nums.length) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j++;
        }

        return i;
    }
}