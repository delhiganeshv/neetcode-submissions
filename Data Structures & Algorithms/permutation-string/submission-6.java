class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = getFrequency(s1);

        for(int i = 0; i < s2.length(); i++) {
            if (i + s1.length() > s2.length()) {
                break;
            }
        

            int[] s2SubStrFreq = getFrequency(s2.substring(i, i + s1.length()));

            boolean isPermuatation = true;
            for(int j = 0; j < 26; j++) {
                if (s2SubStrFreq[j] != s1Freq[j]) {
                    isPermuatation = false;
                    break;
                }
            }

            if (isPermuatation) return true;

        }

    return false;
        
    }

    private int[] getFrequency(String s) {
        int [] frequency = new int[26];
        for(char c : s.toCharArray()) frequency[c - 'a']++;
        return frequency;
    }
}
