class Solution {

    //Go throguh each number in the array then go again and compare if this one is with this continue
    // create an result int which multiply
    public int[] productExceptSelf(int[] nums) {
        int[]output=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
        for(int j=0;j<nums.length;j++){
            if(i==j){
                continue;
            }
            product=product*nums[j];
        }    
        output[i]=product;
      }
      return output;
    }
}