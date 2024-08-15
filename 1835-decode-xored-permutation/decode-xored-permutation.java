class Solution {
    public int[] decode(int[] e) {
        int n=e.length+1;
        int a=0;
        for(int i=1;i<=n;i++){
            a^=i;
        }
        int odd=0;
        for(int j=1;j<n-1;j=j+2){
            odd^=e[j];
        }
        int ans[]=new int[n];
        ans[0]=odd^a;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]^e[i-1];
        }
        return ans;
    }
}