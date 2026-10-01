class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> seen = new HashSet<>();
        List<List<String>> groupedAnagrams = new ArrayList<>();

        if(strs.length < 1) {
            return groupedAnagrams;
        }

        for(int outerIndex = 0; outerIndex < strs.length; outerIndex++) {
            if(!seen.add(strs[outerIndex])) {
                continue;
            }

            String str1 = strs[outerIndex];
            List<String> anagrams = new ArrayList<>();
            anagrams.add(str1);

            for(int innerIndex = outerIndex + 1; innerIndex < strs.length; innerIndex++) {
                String str2 = strs[innerIndex];
                if(this.isAnagram(str1, str2)) {
                    seen.add(str2);
                    anagrams.add(str2);
                }
            }

            groupedAnagrams.add(anagrams);
        }  

        return groupedAnagrams;
    }      

    private boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charFrequencies = new int[26];

        for(int charIndex = 0; charIndex < str1.length(); charIndex++) {
            charFrequencies[str1.charAt(charIndex) - 'a']++;
            charFrequencies[str2.charAt(charIndex) - 'a']--;
        }

        for(int index = 0; index < 26; index++) {
            if (charFrequencies[index] > 0) {
                return false;
            }
        }

        return true;
    }
}
