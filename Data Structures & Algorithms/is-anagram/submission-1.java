class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] q = s.toCharArray();
        char[] r = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(q[i])) {
                map.put(q[i], map.get(q[i]) + 1);
            } else {
                map.put(q[i], 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (!map.containsKey(r[j])) {
                return false;
            }
            if (map.get(r[j]) > 1) {
                map.put(r[j], map.get(r[j]) - 1);
            } else {
                map.remove(r[j]);
            }
        }
        return true;

        // char[] sar = s.toCharArray();
        // char[] tar = t.toCharArray();
        // Arrays.sort(sar);
        // Arrays.sort(tar);
        // for (int i = 0; i < sar.length; i++) {
        //     if (sar[i] != tar[i]) {
        //         return false;
        //     }
        // }
        // return true;
    }
    // create map, index is key? char is value? search for contains values?
}
