class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j) {
            char chrAtLeft = s.charAt(i);
            char chrAtRight = s.charAt(j);

            if (isAlphaNumeric(chrAtLeft) && isAlphaNumeric(chrAtRight)) {
                if (Character.toLowerCase(chrAtLeft) != Character.toLowerCase(chrAtRight)) {
                    return false;
                }
                i++;
                j--;
            }

            if (!isAlphaNumeric(chrAtLeft)) {
                i++;
            }

            if (!isAlphaNumeric(chrAtRight)) {
                j--;
            }
            
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
