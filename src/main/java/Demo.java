public class Demo {
    public static void main(String[] args) {


        for (int i=0;i<=3;i++){

        }

        ListNode listNode = new ListNode();
        listNode.val=2;
        ListNode listNode1 = new ListNode();
        listNode.next=listNode1;



        listNode1.val=4;
        ListNode listNode2 = new ListNode();
        listNode1.next=listNode2;

        listNode2.val=3;
        ListNode listNode3 = new ListNode();
        listNode2.next=listNode3;




        ListNode listNode001 = new ListNode();
        listNode001.val=5;
        ListNode listNode002 = new ListNode();
        listNode001.next=listNode002;


        listNode002.val=6;
        ListNode listNode003 = new ListNode();
        listNode002.next=listNode003;

        listNode003.val=4;
        ListNode listNode004 = new ListNode();
        listNode003.next=listNode004;



        addTwoNumbers(listNode,listNode001);



    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s="";
        while(l1.next!=null){
            s+=l1.val+"";
            l1= l1.next;
        }
        System.out.println(s);


        String s1="";
        while(l2.next!=null){
            s1+=l2.val+"";
            l2= l2.next;
        }
        System.out.println(s1);
        int i1 = Integer.parseInt(s);
        int i2 = Integer.parseInt(s1);
        int i=i1+i2;
        System.out.println(i);

        return null;
    }

}
