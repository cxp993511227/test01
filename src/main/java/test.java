public class test {
    public static void main(String[] args) {
//        int i = mySqrt(2);
//        System.out.println(i);


//        int hello_world = lengthOfLastWord(" ");
//        System.out.println(hello_world);
        ListNode listNode = new ListNode();
        listNode.val=2;

        ListNode listNode1 = new ListNode();
        listNode1.val=4;
        listNode.next=listNode1;
        listNode1.next=null;

        addTwoNumbers(listNode,null);
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1="";
        do {
            s1+=l1.val+"";

        } while(l1.next!=null);
        System.out.println(s1);
        return null;
    }








    public static int searchInsert(int[] nums, int target) {
      for (int i=0;i<=nums.length;i++){
          if(nums[i]>=target){
              return i;
          }

      }
      return  nums.length;

    }





    public  static  int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }







    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");

        if(s1.length==0){
            return 0;
        }
        int length = s1[s1.length-1].length();
        return length;

    }

















    //求平方根
    public static   int mySqrt(int x) {

        if (x==0){
            return 0;
        }

        for (int i=0;i<x;i++){
            double pow = Math.pow(i, 2);
            if(pow>x){
                return i-1;
            }


        }
        return 1;

    }



}

/*
 class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }*/
