class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int midElem = nums[mid];
            if(midElem == target) {
                return mid;
            } else if (midElem > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
        
    }
}
