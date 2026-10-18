class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] concatedResult = new int[2 * numsLength];

        for(int i = 0; i < numsLength; i++) {
            concatedResult[i] = nums[i];
            concatedResult[i + numsLength] = nums[i];
        }

        return concatedResult;
    }
}