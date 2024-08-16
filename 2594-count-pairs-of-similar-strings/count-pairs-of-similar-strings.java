import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int similarPairs(String[] words) {
       
        ArrayList<HashSet<Character>> uniqueSets = new ArrayList<>();

       
        for (String str : words) {
            HashSet<Character> unique = new HashSet<>();
            for (char s : str.toCharArray()) {
                unique.add(s);
            }
            uniqueSets.add(unique);
        }

        int count = 0;

       
        for (int i = 0; i < uniqueSets.size(); i++) {
            for (int j = i+1; j < uniqueSets.size(); j++) {
                
                if (uniqueSets.get(i).equals(uniqueSets.get(j))) {
                    count++;
                }
            }
        }

        return count;
    }
}
