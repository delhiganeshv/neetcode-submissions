class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> numVsIndex = new HashMap<>();

        int currentDistance = k + 1;

        for(int i = 0; i < nums.length; i++) {
            if (numVsIndex.containsKey(nums[i])) {
                int diff = Math.abs(numVsIndex.get(nums[i]) - i);
                currentDistance = Math.min(diff, currentDistance);
            }
            numVsIndex.put(nums[i], i);
        }

        return currentDistance < k + 1;

        
    }
}