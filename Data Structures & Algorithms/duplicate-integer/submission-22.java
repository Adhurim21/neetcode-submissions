class Solution {
public boolean hasDuplicate(int[] nums) {
    Set<Integer>allUniqueNums=new HashSet<>();
    for(int num:nums){
        if(allUniqueNums.contains(num)){
            return true;
        }
        allUniqueNums.add(num);
    }
    return false;
}
}