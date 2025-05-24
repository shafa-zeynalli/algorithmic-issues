import java.sql.SQLOutput;

public class Main3 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                            new ListNode(2,
                                    new ListNode(1)))));

        System.out.println(isPalindrome(h));

//        h.next.next.next.next = h.next;
//        ListNode h = new ListNode(1, new ListNode(2));
//        System.out.println(hasCycle(h)) ;
//        ListNode newHead = reverseList(h);
//        ListNode newHead = removeNthFromEnd(h, 2);
//        printList(newHead);

        int[][] matrix = { {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16} };
    }

    public static void rotate(int[][] matrix) {

    }


    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode current = head;
        int count = 0;

        while(current != null){
            count++;
            current=current.next;
        }

        ListNode secondList = head;
        for(int i=0; i<count/2; i++){
            secondList=secondList.next;
        }

        ListNode firstList = head;
        secondList=reverseList(secondList);

        while(secondList != null){
            if (secondList.val != firstList.val) return false;
            secondList=secondList.next;
            firstList=firstList.next;
        }
        return true;
    }





    public static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        ListNode current = head;
        ListNode nextList = head.next;

        while (current != nextList){
            current=current.next;
            nextList = nextList.next.next;

        }
        return true;
    }


    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }




    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode current = head;
        while(current != null){
            count++;
            current=current.next;
        }

        int index=count - n;
        if (index<=0) return head.next;

        current=head;

        for(int i=1; i < index; i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
