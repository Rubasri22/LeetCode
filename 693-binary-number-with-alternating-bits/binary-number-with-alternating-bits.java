class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean t=false;
        if(n==1){
            return true;
        }
    

        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                t=true;
            }
            else{
                return false;
            }
        }
        return t;



        
    }
}