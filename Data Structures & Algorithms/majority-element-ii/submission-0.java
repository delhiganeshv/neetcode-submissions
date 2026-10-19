class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> majorityElms = new HashSet<>();
        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int num : nums) {
            Integer frequency = frequencies.getOrDefault(num, 0) + 1;
            frequencies.put(num, frequency);

            if (frequency > nums.length / 3) {
                majorityElms.add(num);
            }
        }

        return new ArrayList<>(majorityElms);
        
    }
}