import java.util.*;
class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int i = 0, n = formula.length();
        while (i < n) {
            char ch = formula.charAt(i);
            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            } else if (ch == ')') {
                Map<String, Integer> top = stack.pop();
                i++;
                int start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int multiplier = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                for (String key : top.keySet()) {
                    int count = top.get(key);
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + count * multiplier);
                }
            } else {
                int start = i;
                i++; 
                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }
                String element = formula.substring(start, i);
                start = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
                stack.peek().put(element, stack.peek().getOrDefault(element, 0) + count);
            }
        }
        Map<String, Integer> finalCount = stack.pop();
        List<String> elements = new ArrayList<>(finalCount.keySet());
        Collections.sort(elements);
        StringBuilder result = new StringBuilder();
        for (String element : elements) {
            result.append(element);
            int count = finalCount.get(element);
            if (count > 1) {
                result.append(count);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countOfAtoms("H2O"));          
        System.out.println(sol.countOfAtoms("Mg(OH)2"));      
        System.out.println(sol.countOfAtoms("K4(ON(SO3)2)2")); 
    }
}
