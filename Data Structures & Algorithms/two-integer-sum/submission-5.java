class Solution {
    // Go through the number and subtract with target and find the other one
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int targetNum2=target-nums[i];

            if(numsMap.containsKey(targetNum2)){
              return new int[]{numsMap.get(targetNum2),i};
            }
            numsMap.put(nums[i],i);
        }
                return new int[]{};

        }

    }
