class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sCharFrequencies = new int[26];
        int[] tCharFrequencies = new int[26];

        for(int strIndex = 0; strIndex < s.length(); strIndex++) {
            int sCharFreqIndex = s.charAt(strIndex) - 'a';
            sCharFrequencies[sCharFreqIndex] = ++sCharFrequencies[sCharFreqIndex];

            int tCharFreqIndex = t.charAt(strIndex) - 'a';
            tCharFrequencies[tCharFreqIndex] = ++tCharFrequencies[tCharFreqIndex];
        }

    
        for(int index = 0; index < 26; index++) {
            if(sCharFrequencies[index] != tCharFrequencies[index]) {
                return false;
            }
        }
        return true;
    }
}
