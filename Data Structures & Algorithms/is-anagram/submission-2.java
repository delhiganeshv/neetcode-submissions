class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length () != t.length()) {
            return false;
        }

        Map<Character, Integer> sCharacterHash = new HashMap<>();
        Map<Character, Integer> tCharacterHash = new HashMap<>();

        for(int charIndex = 0; charIndex < s.length(); charIndex++) {
            Integer sCharacterCount = sCharacterHash.get(s.charAt(charIndex));
            Integer tCharacterCount = tCharacterHash.get(t.charAt(charIndex));

            sCharacterHash.put(s.charAt(charIndex), sCharacterCount != null ? sCharacterCount + 1 : 1);
            tCharacterHash.put(t.charAt(charIndex), tCharacterCount != null ? tCharacterCount + 1 : 1);
        }

        if(sCharacterHash.size() != tCharacterHash.size()) {
            return false;
        }

        for(Map.Entry<Character, Integer> characterCount : sCharacterHash.entrySet()) {
            if(!characterCount.getValue().equals(tCharacterHash.get(characterCount.getKey()))) {
                return false;
            }
        }

        return true;
    }
}
