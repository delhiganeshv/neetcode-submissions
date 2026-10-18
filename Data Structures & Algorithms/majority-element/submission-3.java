class Solution {
    public int majorityElement(int[] nums) {
        int mid = nums.length / 2;
        int result = nums[0];

        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int num : nums) {
            Integer frequency = frequencies.getOrDefault(num, 0) + 1;
            if (frequency > mid) {
                result = num;
                break;
            }
            frequencies.put(num, frequency);
            
        }
        return result;
    }
}