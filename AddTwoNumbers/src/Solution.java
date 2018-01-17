/**
 * Created by Zeno on 1/17/18.
 */


//Definition for singly-linked list.

class Solution {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode ret = head;
        while (l1.next != null && l2.next != null) {
            sum = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode tmp = new ListNode(sum);
            ret.next = tmp;
            ret = ret.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        sum = (l1.val + l2.val + carry) % 10;
        carry = (l1.val + l2.val + carry) / 10;
        ListNode tmp = new ListNode(sum);
        ret.next = tmp;
        ret = ret.next;
        l1 = l1.next;
        l2 = l2.next;
        if(l1 != null){
            while(l1 != null){
                sum = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
                ListNode tmp2 = new ListNode(sum);
                ret.next = tmp2;
                ret = ret.next;
                l1 = l1.next;
            }
        }else if(l2 != null){
            while(l2 != null){
                sum = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
                ListNode tmp2 = new ListNode(sum);
                ret.next = tmp2;
                ret = ret.next;
                l2 = l2.next;
            }

        }
        if(carry != 0){
            ListNode tmp2 = new ListNode(carry);
            ret.next = tmp2;
        }

        head = head.next;
        return head;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(5);
        ListNode l2_3 = new ListNode(5);
        l2.next = l2_2;
        l2_2.next = l2_3;

        ListNode res = addTwoNumbers(l1, l2);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);

    }


}



