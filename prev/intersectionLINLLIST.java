class solution{


public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pA = headA, pB = headB;


    while (pA != pB) {
        if (pA == null) 
            pA = headB;  
        else 
            pA = pA.next;

        if (pB == null) 
            pB = headA;  // Switch to headA if pB reaches the end
        else 
            pB = pB.next;
    }

    return pA; 
}
}
// 

