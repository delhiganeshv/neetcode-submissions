class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < sLength; i++) {
            ++charCounts[s.charAt(i) - 'a'];
            --charCounts[t.charAt(i) - 'a'];
        }

        for(int charCount : charCounts) {
            if (charCount != 0) {
                return false;
            }
        }

        return true;
    }
}
