class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();

        int longestLen = 0;

        int left = 0, right = 0;

        while(left < s.length() && right < s.length()) {
            if(hash.contains(s.charAt(right))) {
                longestLen = Math.max(longestLen, hash.size());
                while (s.charAt(left) != s.charAt(right)) {
                    hash.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            hash.add(s.charAt(right));
            right++;
        }

        
        return Math.max(longestLen, hash.size());
    }
}
