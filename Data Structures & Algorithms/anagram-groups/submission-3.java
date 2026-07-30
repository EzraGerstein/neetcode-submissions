class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {;
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charAr = strs[i].toCharArray();
            Arrays.sort(charAr);
            String str = new String(charAr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(strs[i]);
        }   
        return new ArrayList<>(map.values());
    }
}
