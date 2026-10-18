class Solution {
    public String longestCommonPrefix(String[] strs) {
        String currentLongestPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                return "";
            }

            int endIndex = computeCommonPrefixEndIndex(currentLongestPrefix, strs[i]);

            if (endIndex == 0) {
                return "";
            }

            if (endIndex != currentLongestPrefix.length()) {
                currentLongestPrefix = currentLongestPrefix.substring(0, endIndex);
            }
        }

        return currentLongestPrefix;
    }

    private int computeCommonPrefixEndIndex(String currentLongestPrefix, String targetStr) {
        int clpIndex = 0, tsIndex = 0;

        while(clpIndex < currentLongestPrefix.length() && tsIndex < targetStr.length()) {
            if (currentLongestPrefix.charAt(clpIndex) != targetStr.charAt(tsIndex)) {
                break;
            }
            clpIndex++;
            tsIndex++;
        }

        return tsIndex;
    }
}