package com.xuwenlin.leetcode.medium;

public class P2AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if(l1 == null){return l2; }
            if(l2 == null){return l1; }
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            int carry = 0;
            while(l1 != null && l2 != null){
                int dig = l1.val + l2.val + carry;
                int val = dig%10;
                carry = dig/10;
                ListNode newNode = new ListNode(val);
                current.next = newNode;
                current = current.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            while(l1 != null){ //l1 不为空 而l2 已为空
                int val = (l1.val + carry)%10;
                carry = (l1.val + carry)/10;
                current.next = new ListNode(val);
                current = current.next;
                l1 = l1.next;
            }
            while(l2 != null){ //l2 不为空 而l1 已为空
                int val = (l2.val + carry)%10;
                carry = (l2.val + carry)/10;
                current.next = new ListNode(val);
                current = current.next;
                l2 = l2.next;
            }
            if(carry!=0){
                current.next = new ListNode(carry);
            }

            return dummy.next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}