class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // int a = 0;
        // int b = nums.length - 1;
        
        // while (nums[a] + nums[b] != target && b > a) {
        //     if (nums[a] + nums[b] > target) {
        //         b--;
        //     } else {
        //         a++;
        //     }
        // }
        // return new int[]{map.equals(), b};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
}
