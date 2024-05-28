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




    private static ListNode insertLL(ListNode head, int i) {
        ListNode newNode = new ListNode(i); // 1. make a new node
        if(head == null){
            return newNode; //2. if head is NULL return new Node
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

        return head;
    }


    private static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(" -> " + temp.val);
            temp = temp.next;
        }
        System.out.println("");

    }

    private static ListNode deleteElementFromLinkedList(ListNode head, int val){

        ListNode curr = head;
        if(curr.val ==val){
            head=curr.next;
            return head;
        }
        while(curr !=null && curr.next !=null){
          if(curr.next.val== val){
              curr.next=curr.next.next;
          }
          else{
              curr=curr.next;
          }
        }
        return head;
    }

    public static ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static ListNode getMiddleNode(ListNode head){
        int count=0;
        if(head == null || head.next==null){
            return head;
        }
        else{
            ListNode currNode=head;
            while(currNode.next != null){
                count++;
                currNode=currNode.next;
            }
            currNode=head;
            int mid = count/2+1;
            while(currNode !=null) {
              mid=mid-1;
              if(mid==0){
                  break;
              }
              currNode=currNode.next;
            }
            return currNode;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        for(int i=0;i<5;i++){
            head = insertLL(head,i);
        }
        printLL(head);
        //deleteElementFromLinkedList(head,2 );
        //System.out.println("Post deletion");
        //printLL(head);
        System.out.println("Reverse");
        head = reverseLL(head);
        printLL(head);
        head = getMiddleNode(head);
        System.out.println("Middle "+ head.val);
    }

}
