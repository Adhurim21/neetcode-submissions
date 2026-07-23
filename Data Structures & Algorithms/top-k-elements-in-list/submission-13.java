class Solution {
   //HashMap 
   //Loop 
   //ArrayList(KEY)
   //Sort list-Lamba(count b)-a 
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
