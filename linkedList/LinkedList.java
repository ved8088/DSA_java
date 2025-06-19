package linkedList;

public class LinkedList{

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;

    }

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    //insert in any index of linked list
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    public int delete(int index){
        System.out.println("inside delete func can we .next.next.next----> "+"from head--> "+head.value+"to --> "+ head.next.next.next.value);

        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }

        Node prev = traverse(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public Node traverse(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    //insert using recursion
    public void insertRecursion(int val,int index){

    }
//    private Node insertRecursion(int val,int index,Node node){
//        if(index == 0){
//            Node temp = new Node(val,node);
//            size++;
//            return temp;
//
//        }
//
//        node.next = insertRecursion(val,index--,node.next);
//
//
//    }


    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = traverse(size-2);
        Node op = traverse(size-1);
        System.out.println("this is size value in delete last -->" + op.value);
        int val = tail.value;
        secondLast.next = null;
        tail = secondLast;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node.next = node;
        }

        return null;
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("End");

    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node nxt){
            this.value = value;
            this.next = nxt;
        }


    }


    // Linked List leetcode question

    public void duplicates(){
        Node node =  head;
        while(node.next != null){
            if( node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

    }

     public void mergeLL(Node first,Node second){

        Node head1 = first;
        Node head2 = second;

        Node ans = new Node(0);

     }

     public boolean hasCycle(Node head){
        Node fast= head;
        Node slow = head;

        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

     }

     //find length of Cycle

    public int lengthCycle(Node head){

        Node fast= head;
        Node slow = head;
        int len = 0;

        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                Node temp = slow.next;
                while(temp!=fast){
                    temp = temp.next;
                    len++;
                }
                return len;
            }
        }
       return 0;
    }


    public Node detectCycle(Node head) {
        int len = 0;

        Node fast= head;
        Node slow = head;

        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                len = lengthCycle(slow);
                break;
            }
        }

        if(len ==0){
            return null;
        }

        // need to find the start
        Node f = head;
        Node s = head;

        while(len > 0){
            s=s.next;
            len--;
        }

        //keep moving both forward and they will meet at cycle end

        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }

    public boolean ishappy(int num){
           int slow = num;
           int fast = num;

           do{
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));

           }while(slow != fast);

           if(slow == 1){
               return true;
           }
           return false;

    }

    private int findSquare(int num){
        int ans = 0;
        while (num>0){
            int rem = num % 10;
            ans = ans + (rem*rem);
            num /= 10;
        }
        return ans;

    }

    public Node sortList(Node head){
        if(head == null || head.next != null ){
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return merge(left,right);
    }

 Node merge(Node list1,Node list2){
        Node dummyhead = new Node(0);
        Node tail = dummyhead;
        while(list1 != null && list2 != null){
            if(list1.value < list2.value){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next  = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

    tail.next = (list1!=null)?list1:list2;
    return dummyhead.next;
 }

 Node getMid(Node head){
          Node midPrev = null;
      while(head!=null && head.next != null){
            midPrev = (midPrev == null)?head:midPrev.next;
            head = head.next;
      }
      Node mid = midPrev.next;
      midPrev.next = null;
      return mid;
 }



}
