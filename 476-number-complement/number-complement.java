class Solution {
    public int findComplement(int num) {
        int shift=0,ans=0;
        while((num>>shift)>0)
        {
          if(((num>>shift)&1)==0)
          {
             ans=ans+(1<<shift);
          }
        // System.out.println("num is "+num+" shift is "+shift+"ans is "+ans);
          shift+=1;
        }
        return ans;
    }
}