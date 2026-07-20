class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] sar = s.toCharArray();
            char[] tar = t.toCharArray();
            Arrays.sort(sar);
            Arrays.sort(tar);
            for (int i = 0; i < sar.length; i++) {
                if (sar[i] != tar[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
