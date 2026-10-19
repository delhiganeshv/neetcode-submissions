class Solution {
    public int[] sortArray(int[] nums) {
        int numsLen = nums.length;
        if (numsLen <= 1) {
            return nums;
        }

        int midIndex = numsLen / 2;
        int[] leftArr = sortArray(Arrays.copyOfRange(nums, 0, midIndex));
        int[] rightArr = sortArray(Arrays.copyOfRange(nums, midIndex, numsLen));

        return mergeArray(leftArr, rightArr);
    }

    private int[] mergeArray(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergedArr[k] = nums1[i++]; 
            } else {
                mergedArr[k] = nums2[j++];
            }
            k++;
        } 

        while(i < nums1.length) {
            mergedArr[k++] = nums1[i++];
        }

        while(j < nums2.length) {
            mergedArr[k++] = nums2[j++];
        }

        return mergedArr;
    }
}