/**
 * @Author: ddpff
 * @Description: 请编写一个函数，使其可以删除某个链表中给定的节点，你将只被给定要求被删除的节点。
 * @Date: Create in 20:54 2018\11\28 0028
 * @Modified By:要删除一个节点实际是通过它的next节点的值来覆盖这个节点，然后此节点的next指向其next
 * 的next
 */
public class Solution_DeleteNode {
    public void deleteNode(ListNode node) {
        if (node.next==null){
            node=null;
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
