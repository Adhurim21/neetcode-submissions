class Solution {
    // Go through the number and subtract with target and find the other one
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapNums=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int targetNumber=target-nums[i];
        if(mapNums.containsKey(targetNumber)){
        return new int[]{mapNums.get(targetNumber), i};
        }
        mapNums.put(nums[i],i);
        }
        return new int[]{};
        }

    }
