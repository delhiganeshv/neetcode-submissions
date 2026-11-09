class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while(i < matrix.length) {
            if (matrix[i][0] > target) {
                break;
            }
            i++;
        }

        i = i - 1 < 0 ? 0 : i - 1;
        return searchArray(matrix[i], target);
        
    }

    private boolean searchArray(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}
