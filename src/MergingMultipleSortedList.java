import java.util.LinkedList;

/**
 * Created by UDAY on 12/12/2017.
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class MergingMultipleSortedList {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[1];
        ListNode node1= new ListNode(0);
        ListNode node2= new ListNode(2);
        node1.next = node2;
        ListNode node3= new ListNode(5);
        node2.next= node3;
        lists[0]= node1;
        mergeKLists(lists);
    }

    /**
     * Definition for singly-linked list.**/
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public static ListNode mergeKLists(ListNode[] lists) {
            ListNode mergedListNode = null;
            ListNode refNode= null;
            int allElement = 0;
            for (int i=0; i< lists.length; i++){
                ListNode listnode= lists[i];
                while(listnode != null){
                    ++allElement;
                    listnode= listnode.next;
                }
            }
            for(int j=0; j<allElement ; j++ ){
                int min = Integer.MAX_VALUE;
                for (int i=0; i< lists.length; i++){
                    if(lists[i]!= null && lists[i].val <= min){
                        min = lists[i].val;
                        ListNode mergableListNode = new ListNode(min);
                        if(mergedListNode == null){
                            mergedListNode = mergableListNode;
                            refNode = mergableListNode;
                        }else {
                            refNode.next = mergableListNode;
                            refNode = mergableListNode;
                        }
                        lists[i]= lists[i].next;
                    }
                }

            }
            return  mergedListNode;
        }

}
