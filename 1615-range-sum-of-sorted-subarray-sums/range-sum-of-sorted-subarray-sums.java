class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subarraySums = new ArrayList<>();
        
       
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }
        
      
        Collections.sort(subarraySums);
        
      
        int mod = 1_000_000_007;
        long result = 0;
        for (int k = left - 1; k < right; k++) {
            result = (result + subarraySums.get(k)) % mod;
        }
        
        return (int) result;
    }
}