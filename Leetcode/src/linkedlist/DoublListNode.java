package linkedlist;

import java.util.List;

public class DoublListNode {
    int val;
    DoublListNode next;
    DoublListNode pre;

    public DoublListNode() {
    }

    public DoublListNode(int val) {
        this.val = val;
    }

    public DoublListNode(int val, DoublListNode next, DoublListNode pre) {
        this.val = val;
        this.next = next;
        this.pre = pre;
    }
    public static DoublListNode insertIntoDLL(DoublListNode head, int i){
        DoublListNode newNode = new DoublListNode(i,null,null);
        if(head==null){
            return  new DoublListNode(i,null,null);
        }
        else{
            DoublListNode currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.pre=currNode;
            return head;
        }
    }

    public static DoublListNode convertArrayIntoDL(DoublListNode head, int[] arr){
        {
            if(head == null){
                return new DoublListNode(arr[0]);
            }
            DoublListNode currNode = head;
            while(currNode.next != null){
                currNode=currNode.next;
            }
            for(int i=0;i<arr.length;i++) {
                DoublListNode node = new DoublListNode(arr[i],null,null);
                currNode.next = node;
                node.pre=currNode;
                currNode=node;
            }
        }
return head;
}

public static void printDL(DoublListNode head){
        DoublListNode currNode= head;
        while(currNode != null){
            System.out.println("Node - >"+currNode.val);
            currNode=currNode.next;
        }
}

public static DoublListNode reverseLL(DoublListNode head){
        DoublListNode previous = null;
        DoublListNode present = head;
        DoublListNode next ;
        while(present != null){
            DoublListNode temp = present.next;
            present.next= previous;
            previous = temp;
            head = previous;
            present=temp;
        }
        return head;
}



    public static void main(String[] args) {
        DoublListNode head = null;
        int[] arr= {4,6,8,1,5};
        //DoublListNode node = convertArrayIntoDL(head,arr);
        //System.out.println("Arry to LL");
        //printDL(node);
        int i=0;
        while(i!=5){
            head =  insertIntoDLL(head,++i);
        }
        System.out.println("Normal");
        printDL(head);
        System.out.println("Reverse");
        reverseLL(head);
        printDL(head);
    }
}
