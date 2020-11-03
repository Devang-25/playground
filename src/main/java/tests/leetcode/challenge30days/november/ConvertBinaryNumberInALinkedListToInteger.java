package tests.leetcode.challenge30days.november;

import tests.leetcode.challenge30days.dataStructure.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    /*
    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
    The linked list holds the binary representation of a number.
    Return the decimal value of the number in the linked list.
    Input: head = [1,0,1]
    Output: 5
    Explanation: (101) in base 2 = (5) in base 10
    Example 2:

    Input: head = [0]
    Output: 0
    Example 3:

    Input: head = [1]
    Output: 1
    Example 4:

    Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
    Output: 18880
    Example 5:

    Input: head = [0,0]
    Output: 0

    Constraints:

    The Linked List is not empty.
    Number of nodes will not exceed 30.
    Each node's value is either 0 or 1.
     */
    public static int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            if (head.val == 1) builder.append("1");
            else builder.append("0");
            head = head.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }

    public static void main(String[] args) {
        ListNode list =
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(0,
                                        new ListNode(1,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(1,
                                                                        new ListNode(1, null))))))));
        System.out.println(getDecimalValue(list));
        //10010011
    }
}
