class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String sortedS1 = sortedStr(s1);

        for(int i = 0; i < s2.length(); i++) {
            if (i + s1.length() > s2.length()) {
                break;
            }
        

            String sortedSubS2 = sortedStr(s2.substring(i, i + s1.length()));
                

            if (sortedSubS2.equals(sortedS1)) {
                return true;
            }

        }

    return false;
        
    }

    private String sortedStr(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        return new String(sArr);
    }
}
