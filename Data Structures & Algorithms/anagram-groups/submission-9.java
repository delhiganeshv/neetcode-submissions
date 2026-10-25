class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> seen = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        int i = 0;
        while(i < strs.length) {
            if(!seen.contains(strs[i])) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);

                int j = i + 1;
                while(j < strs.length) {
                    if (isAnagram(strs[i], strs[j])) {
                        anagrams.add(strs[j]);
                        seen.add(strs[j]);
                    }
                    j++;
                }
                result.add(anagrams);
            }
            i++;
        }
        return result;
    }

    private boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] frequencies = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            frequencies[str1.charAt(i) - 'a']++;
            frequencies[str2.charAt(i) - 'a']--;
        }

        for(int freq : frequencies) {
            if(freq > 0) {
                return false;
            }
        }
        return true;
    }
}
 