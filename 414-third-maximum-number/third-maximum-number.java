class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        return nums[0];
        else if(nums.length==2)
        return nums[1];
      //  else if(nums.length==3)
       // return nums[2];
       int count =0;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]!=nums[i+1]){
        count++;
       }
       if(count==2 )
       return nums[i];
    }
    return nums[nums.length-1];

      
     
    }
}