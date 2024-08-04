class Solution {
    public boolean isPalindrome(String s) {
        s.trim();
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] a=s1.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
            if(a[left]!=a[right]){
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}