/**
 * @Author: ddpff
 * @Description:编写一个程序，找到两个单链表相交的起始节点。
 * @Date: Create in 17:10 2018\11\29 0029
 * @Modified By:方法1=计算两个链表的长度，剔除长链表的前面部分，从两个链表长度相同时开始比较，
 *              第一个相等的节点就是公共节点。
 *              方法二=通过hashset实现，把一条链表放入hash中，当第二条链表存放时如果put（）false就说明
 *              存在node。
 */
public class Solution_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int numa=0;
        int numb=0;
        ListNode p1=headA;
        ListNode p2=headB;
        while (p1!=null){
            numa++;
            p1=p1.next;
        }
        while (p2!=null){
            numb++;
            p2=p2.next;
        }
        p1=headA;
        p2=headB;
        int count=0;
        int length=numa-numb;
        if (length>0){
        while (count++<length){
            p1=p1.next;
        }
        }else {
        while (count++<-length){
           p2=p2.next;
        }
        }
        while (p1!=null){
            if (p1==p2){
                return p1;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return null;
    }
}


