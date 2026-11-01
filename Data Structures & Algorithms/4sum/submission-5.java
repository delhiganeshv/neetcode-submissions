class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int numsLen = nums.length;
        Set<List<Integer>> quadruplets = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < numsLen - 3; i++) {
            if(nums[i] > 0 && nums[i] > target) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < numsLen - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1, r= numsLen - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(quadruplets);     
    }
}