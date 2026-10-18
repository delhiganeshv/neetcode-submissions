class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = prefix.substring(0, commonLength(prefix, strs[i]));
            if(prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    private int commonLength(String a, String b) {
        int i = 0;
        int n = Math.min(a.length(), b.length());

        while(i < n) {
            if (a.charAt(i) != b.charAt(i)) {
                break;
            }
            i++;
        }

        return i;
    }
}