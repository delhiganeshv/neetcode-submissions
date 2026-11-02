class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numVsIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (numVsIndex.containsKey(nums[i]) && i - numVsIndex.get(nums[i]) <= k) {
               return true;
            }
            numVsIndex.put(nums[i], i);
        }

        return false;

        
    }
}