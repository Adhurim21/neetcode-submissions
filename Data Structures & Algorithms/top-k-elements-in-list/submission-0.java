class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
    }

    ArrayList<Integer> list = new ArrayList<>(countMap.keySet());

    list.sort((a, b) -> countMap.get(b) - countMap.get(a));

    int[] result = new int[k];
    for (int j = 0; j < k; j++) {
        result[j] = list.get(j);
    }
    return result;
}
}
