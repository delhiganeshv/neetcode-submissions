class Solution {
    public int mySqrt(int x) {
        int res = 0;

        int l = 0, r = x;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            long product = (long) mid * mid;
            if (product == x) {
                return mid;
            } else if(product < x) {
                l = mid + 1;
                res = mid;
            } else {
                r = mid - 1;
            }

        }
        return res;
    }
}