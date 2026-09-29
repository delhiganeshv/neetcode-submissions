class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffAgainstIndex = new HashMap<>();
        int[] twoSumIndices = new int[2];
        for(int index = 0; index < nums.length; index++) {
            if (diffAgainstIndex.get(nums[index]) != null) {
                twoSumIndices[0] = diffAgainstIndex.get(nums[index]);
                twoSumIndices[1] = index;
                break;
            } 

            diffAgainstIndex.put(target - nums[index], index);
        } 

        return twoSumIndices;
    }
}
