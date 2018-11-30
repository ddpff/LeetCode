/**
 * @Author: ddpff
 * @Description:
 *              给定一个链表，判断链表中是否有环。
 * @Date: Create in 16:06 2018\11\30 0030
 * @Modified By:  快慢指针，当双指针相遇的话就说明有环
 */
public class Solution_LinkedCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow;
        ListNode fast;
        slow=head;
        fast=head.next;
        while (fast!=slow){
            if (fast==null||fast.next==null){
                return false;
            }else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return true;
    }

    public boolean hasCycle1(ListNode head){
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow;
        ListNode fast;
        slow=head;
        fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
