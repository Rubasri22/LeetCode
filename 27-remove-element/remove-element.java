class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
       // int[] res=new int[n]
       int j=0;
        for(int i=0;i<nums.length;i++){
          
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;

            }


        }
        return j;

        
    }
}