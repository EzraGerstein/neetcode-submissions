class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charAr = strs[i].toCharArray();
            Arrays.sort(charAr);
            String str = String.valueOf(charAr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(strs[i]);
        }   
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
