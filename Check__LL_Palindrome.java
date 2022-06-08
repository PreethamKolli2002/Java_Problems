public class Check_LL_Palindrome {

    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static ListNode createLL(int arr[]){
        ListNode temp = new ListNode(arr[0]),head,last;
        head=temp;
        last=temp;

        for(int i=1;i<arr.length;i++){
            temp = new ListNode(arr[i]);
            last.next=temp;
            last=temp;
        }

        return head;
    }

    public static void display(ListNode head){
        ListNode temp=head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static boolean checkLLPalindrome(ListNode head,int n){
        int i;
        ListNode p,q,cur=null,prev=null;
        boolean flag=true;
        p=head;

        for(i=0;i<n/2;i++){
            p=p.next;
        }

        //System.out.println("\n" + p.data);

        q = p.next;

        while(q!=null){
            cur=q;
            q=q.next;
            cur.next = prev;
            if(cur.next==null){
                System.out.println(cur.data);
            }
            prev=cur;
        }

        p.next=cur;

        System.out.println();

        display(head);

        p=head;
        q=p.next;

        while(p!=q){
            if(p.data!=q.data){
                flag=false;
                break;
            }
            p=p.next;
            q=q.next;
        }

        return flag;
    }

    public static void main(String[] args) {
      int arr[],n=6,i;
      boolean flag;

      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the number of nodes: ");
//      n = sc.nextInt();
//      arr = new int[n];

        arr = new int[]{1,2,3,3,2,1};

      ListNode head;

      head = createLL(arr);
      display(head);

      flag = checkLLPalindrome(head,n);

        System.out.println();

      if(flag){
          System.out.println("YES");
      }
      else{
          System.out.println("NO");
      }



    }

}
