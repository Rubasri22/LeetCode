class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[m-1]){
                    a[i]=-1;
                }
                else{
                    if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<m;k++){
                        int max=nums2[k];
                        max=Math.max(nums2[k],max);
                        if(max>-1&&max>nums2[j]){
                            a[i]=max;
                            break;
                        }
                        else{
                            a[i]=-1;
                        }
                    }
                   
                    
                }
            }
        }
        }
        return a;
        
    }
}