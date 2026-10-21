class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            numsSet.add(num);
        }

        int longestSeqLen = 0;
        for(Integer num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int length = 0;
                while(numsSet.contains(num + length)) {
                    length++;
                }

                longestSeqLen = Math.max(longestSeqLen, length);
            }
        }
        

        return longestSeqLen;
    }
}
