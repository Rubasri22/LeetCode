class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] jewel =jewels.toCharArray();
        char[] stone=stones.toCharArray();
        for(int i=0;i<jewel.length;i++){
            for(int j=0;j<stone.length;j++){
                if(jewel[i]==stone[j]){
                    count++;
                }
            }
        }
        return count;

         
        
    }
}