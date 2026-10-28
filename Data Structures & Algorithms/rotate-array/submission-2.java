class Solution {
    public void rotate(int[] nums, int k) {
        int numsLen = nums.length;
        k %= numsLen;
  
        reverseArray(nums, 0, numsLen - 1);
      
        reverseArray(nums, 0, k - 1);
         
        reverseArray(nums, k, numsLen - 1);
       
    }

    private void reverseArray(int[] nums, int start, int end) {     
        while(start < end) {
            int swapHolder = nums[start];
            nums[start] = nums[end];
            nums[end] = swapHolder;
            start++;
            end--;
        }
    }

}