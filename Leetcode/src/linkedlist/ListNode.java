package linkedlist;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode();
        for(int i=0;i<5;i++){
            insertLL(head,i);
        }
        printLL(head);
        System.out.println(12345 / 100); // 1234 / 100 -> 123.45
        System.out.println(99 % 100); // random %99
        System.out.println(100 % 100); // random 100 / 100 -> 0
        System.out.println(45 % 10 ); //
        9+9
    }

    private static ListNode insertLL(ListNode head, int i) {
        ListNode newNode= new ListNode(i); // 1. make a new node
        if(head == null){
            return newNode; //2. if head is NULL return new Node
        }
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
        }
        curr = newNode; // ???
//        null = "string some string";

//        1 -> 2 3 4 null


        return head;
        }

        private static void printLL(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.println("Node Value -> " + temp.val);
                temp = temp.next;
            }

        }
}
