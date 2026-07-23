class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numy = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if (numy.containsKey(targetNum)) {
                return new int[] { numy.get(targetNum), i };
            }
            numy.put(nums[i], i);
        }
        return new int[]{};
    }
}