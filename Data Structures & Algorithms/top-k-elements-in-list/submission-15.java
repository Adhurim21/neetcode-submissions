class Solution {
  // Create a hashmap that counts how many times each num is showing 
  // Create a for loop to go through all the nums 
  // Create something that sorts them from the highest to the lowest from the hashmap(Lamba)
  // Create a an new array of the size k which goes through k
     public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer>countMaps=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        countMaps.put(nums[i],countMaps.getOrDefault(nums[i],0)+1);
      }
      List<Integer>key=new ArrayList<>(countMaps.keySet());

      key.sort((a,b)->countMaps.get(b)-countMaps.get(a));

      int result[]=new int[k];
      for(int j=0;j<k;j++){
        result[j]=key.get(j);
      }
     return result;
     }
}
