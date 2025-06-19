package linkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList ll = new LinkedList();
//
//        ll.insertFirst(1);
//        ll.insertFirst(2);
//        ll.insertFirst(3);
//        ll.insertFirst(4);
//        ll.insertFirst(5);
//        ll.insertLast(99);
//        ll.insert(100,3);
//        ll.display();
//        System.out.println(ll.deleteFirst());
//        ll.display();
//        System.out.println(ll.deleteLast());
//        ll.display();
//        System.out.println(ll.delete(3));
//        ll.display();

        doublyLinkedList dd = new doublyLinkedList();
        dd.insertFirst(1);
        dd.insertFirst(2);
        dd.insertFirst(3);
        dd.insertFirst(4);
//        dd.display();
        dd.displayInReverse();

        dd.insertLast(99);

        dd.display();
        dd.displayInReverse();


    }
}
