class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;

        if(length <= 1) {
            return nums;
        }

        Map<Integer, Integer> counts = new HashMap<>();

        for(int num : nums) {
            Integer frequency = counts.getOrDefault(num, 0) + 1;
            counts.put(num, frequency);
        }

        List<Integer> unsortedKeys = new ArrayList<>(counts.keySet());
        unsortedKeys.sort((a, b) -> counts.get(b).compareTo(counts.get(a)));

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = unsortedKeys.get(i);
        }

        return result;
        
    }
}
