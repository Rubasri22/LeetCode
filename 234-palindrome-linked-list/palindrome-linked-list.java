/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Initialize a stack to store the values from the linked list
        Stack<Integer> st = new Stack<>();
        // Temporary pointer to traverse the linked list
        ListNode temp = head;

        // Debug statement to print the initial head node
        //System.out.println("Initial head: " + (head != null ? head.val : "null"));

        // Push all values from the linked list onto the stack
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        // Debug statement to print the stack after pushing all values
        //System.out.println("Stack after pushing values: " + st);

        // Reset temp to the head of the list
        temp = head;

        // Compare values from the stack and the linked list
        while (!st.isEmpty()) {
            // Debug statement to print the current head value and stack top value
          //  System.out.println("Comparing head value: " + temp.val + " with stack top: " + st.peek());

            if (st.peek() != temp.val) {
                // Values do not match, so the list is not a palindrome
               // System.out.println("Values do not match. Not a palindrome.");
                return false;
            }
            // Pop the top value from the stack and advance the head pointer
            st.pop();
            temp = temp.next;
        }

        // If the loop completes without returning false, the list is a palindrome
        //System.out.println("List is a palindrome.");
        return true;
    }
}
