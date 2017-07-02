package cn.bupt.swordToOffer;

/**
 * Created by chongli on 2017/7/3.
 */
public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if (fast == slow)
                break;
        }
        if (fast==null || fast.next==null){
            return null;
        }
        slow =pHead;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
