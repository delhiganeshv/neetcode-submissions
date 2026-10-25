class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingNum = 1;

        Set<Integer> numsSet = new HashSet<>();

        for(int num : nums) {
            numsSet.add(num);
        }

        while(true) {
            if (!numsSet.contains(missingNum)) {
                break;
            }
            missingNum++;
        }
        return missingNum;
    }
}