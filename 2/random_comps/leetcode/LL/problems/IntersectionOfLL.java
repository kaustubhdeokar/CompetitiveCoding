package LL.problems;


public class IntersectionOfLL{

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        int len1 = 0;
        int len2 = 0;
        
        while(temp1!=null){
            temp1 = temp1.next;
            len1+=1;
        }
        
        while(temp2!=null){
            temp2 = temp2.next;
            len2+=1;
        }
        
        int diff = Math.abs(len1-len2);
        temp1 = headA;
        temp2 = headB;
        
        if(len1>len2){
            for(int i=0;i<diff;i++)
                temp1 = temp1.next;            
        }
        else{
            for(int i=0;i<diff;i++)
                temp2 = temp2.next;
        }
        
        while(temp1!=null && temp2!=null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

}