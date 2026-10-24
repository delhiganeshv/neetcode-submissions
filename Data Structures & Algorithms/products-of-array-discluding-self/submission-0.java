class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int numsLen = nums.length;
        int[] prefixProds = new int[numsLen];
        int[] suffixProds = new int[numsLen];

        for(int i = 0; i < numsLen; i++) {
            if (i > 0) {
                prefixProds[i] = prefixProds[i - 1] * nums[i];
                suffixProds[numsLen - i - 1] = suffixProds[numsLen - i] * nums[numsLen - i - 1];
            } else {
                prefixProds[i] = nums[i];
                suffixProds[numsLen - i - 1] = nums[numsLen - i - 1];
            }
        }

        int[] productArr = new int[numsLen];
        for(int i = 0; i < numsLen; i++) {
            int leftArrProd = i > 0 ? prefixProds[i - 1] : 1;
            int rightArrProd = i < numsLen - 1 ? suffixProds[i + 1] : 1;
            productArr[i] = leftArrProd * rightArrProd; 
        }
        return productArr;
    }
}  
