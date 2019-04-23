/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) { //example [1,2,3] and [1,2,4]
        if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        }
        ListNode newListH = null;
        if (l1.val <= l2.val){ // This sets newListH to either l1 or l2 linkedlist based on these conditions.
            newListH = l1;   // sets newListH = [1,2,3]   
            l1 = l1.next; // This sets linkedlist to the next pointer. Sets l1 = [2,3]
        } else {
            newListH = l2;
            l2 = l2.next;
        }
        ListNode newListL = newListH; //the varible equals [1,2,3] or add last item of the list
        while (l1 != null && l2 != null){ // While both list are not empty
            if (l1.val <= l2.val){ //.val only gets the first node
               newListL.next = l1; 
               l1 = l1.next;
            } else {
                newListL.next = l2; //append node [1] to newListL. newListL is now [1,1]. 
                l2 = l2.next; //set l2 to [2,4]
            } newListL = newListL.next; //last added node is the last node. Basically shuffles to next node to be used
        }
        if (l1 == null) { // if one node is empty, append the rest of the other list
            newListL.next = l2;
        } else {
            newListL.next = l1;
        }
        return newListH;
    }
}

/* 
can think of it like this. visual explaination
1 -> 2 -> 4
1 -> 3 -> 4

newListH = 1 -> 2 -> 4

while loop
1 -> 1 -> 3 -> 4 
1 -> 1 -> 2 -> 4
1 -> 1 -> 2 -> 3 -> 4
1 -> 1 -> 2 -> 3 -> 4 -> 4
*/
