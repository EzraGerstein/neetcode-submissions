class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, String> numbers = new HashMap<>();
        for (int num : nums) {
            if (numbers.containsKey(num)) {
                return true;
            }
            else {
                numbers.put(num, "");
            }
        }
        return false;
    }
}