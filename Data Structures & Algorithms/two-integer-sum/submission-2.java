class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> diffVsIndex = new HashMap<>();
       int[] indices = new int[2];

       for (int i = 0; i < nums.length; i++) {
            if (diffVsIndex.containsKey(nums[i])) {
                indices[0] = diffVsIndex.get(nums[i]);
                indices[1] = i;
                break;
            }

            int targetDifference = target - nums[i];
            if (!diffVsIndex.containsKey(targetDifference)) {
                diffVsIndex.put(targetDifference, i);
            }
        }

        return indices;
    }
}
