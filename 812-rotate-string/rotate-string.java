class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;
        int n = s.length();

        for (int i=0;i<n;i++) {
            boolean match=true;
            for (int j = 0; j < n; j++) {
                if (str.charAt(i + j) != goal.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}