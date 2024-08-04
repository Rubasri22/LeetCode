class Solution {
    public int firstUniqChar(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count++;
                    break;
                   // continue;
                }
               
            }
             if(count==0){
            return i;
            }
        }
        
        //if(count==1){
           // return i;
        
        return -1;
        
    }
}