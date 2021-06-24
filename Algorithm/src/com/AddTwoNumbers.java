package com;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){

        ListNode head = null,tail = null;//创建新的头结点和尾结点
        int carry = 0;
        while(l1 != null || l2 != null){
            int n1 = (l1 != null ? l1.val:0); //结点不为null的话就赋值当前结点的值，否则赋值为零
            int n2 = (l2 != null ? l2.val:0);
            int sum  = n1 + n2 + carry;  //从前往后取值相加，carry最初是n1+n2相加的十位上的值
            if(head == null){
                head = tail = new ListNode(sum%10); //开始head为空，head=tail,并赋值sum%10

            }else{
                tail.next = new ListNode(sum%10); //head不为空，则直接赋值sum%10
                tail = tail.next;   //后移一位
            }
            carry = sum/10;  //carry即十位上的值，进制
            if(l1 != null){   //如果l1不为null则直接后移一位
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry>0){           //最后一个进制放最后,千万别忘了。
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
      }
}