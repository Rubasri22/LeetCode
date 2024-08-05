class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count the occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Collect the numbers that appear exactly twice
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                result.add(key);
            }
        }

        return result;
    }
}
        
