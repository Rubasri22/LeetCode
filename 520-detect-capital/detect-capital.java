class Solution {
    public boolean detectCapitalUse(String word) {
        int u=0;
        int l=0;
        for(int i=0;i<word.length();i++){
        if(Character.isUpperCase(word.charAt(i))){
            u++;
        }
        else if(Character.isLowerCase(word.charAt(i))){
            l++;
        }
        }
        if (u == 1 && Character.isUpperCase(word.charAt(0))) {
    return true;
}

       else if(u==word.length() || l==word.length()){
            return true;
        }
        
            return false;
    

        
    }
}