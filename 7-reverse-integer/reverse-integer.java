class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 ||
                (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; 
            }
            if (reversed < Integer.MIN_VALUE / 10 ||
                (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }
        return reversed;
    }
}
