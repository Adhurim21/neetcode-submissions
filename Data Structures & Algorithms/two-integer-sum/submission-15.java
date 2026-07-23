class Solution {
    // Go through the number and subtract with target and find the other one
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>numMaps=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int targetNum=target-nums[i];
        if(numMaps.containsKey(targetNum)){
           return new int[]{numMaps.get(targetNum), i};
        }    
        numMaps.put(nums[i],i);
    }
    return new int[]{};
}
}
