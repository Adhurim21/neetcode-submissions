class Solution {
    //I will create a loop to go through all the numbers in the array 
    //I will create a hashet to add all the numbers in it and not allow duplicates 
    // if statement that if nums[i]. is in the set then return false else 
    //if that value is aleardy in the set return false 
public boolean hasDuplicate(int[] nums) {
    Set<Integer>allUniqueNums=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(allUniqueNums.contains(nums[i])){
            return true;
        }
         allUniqueNums.add(nums[i]);
    }
        return false;
    }
}