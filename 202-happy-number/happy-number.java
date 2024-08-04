import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenSums = new HashSet<>(); // Set to track seen sums

        while (n != 1) {
            if (seenSums.contains(n)) {
                return false; // If we see a sum we've seen before, it's not a happy number
            }
            seenSums.add(n);

            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return true; // If we reach 1, it is a happy number
    }
}
