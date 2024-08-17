class Solution {
    public String shortestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(j>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }
        if(i==s.length())
        return s;
        String suf=s.substring(i);
        String pre=new StringBuilder(suf).reverse().toString();
        String mid=shortestPalindrome(s.substring(0,i));
        return pre+mid+suf;
    }
}