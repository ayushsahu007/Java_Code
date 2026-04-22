package LinkedList.singlyLinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    static int count;

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            count++;
        } else {
            tail.next = node;
            tail = node;
            count++;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No data Display");
            return;
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void update(int data, int position) {
        if (head == null) {
            System.out.println("No dta to update");
            return;
        }
        if (position == 1) {
            head.data = data;
            return;
        }
        if (position == count) {
            tail.data = data;
            return;
        }
        if (position < 1 || position > count) {
            System.out.println("Position out of bound");
            return;
        }
        Node current = head;
        for (int i = 1;i<count;i++){
            if (i==position){
                current.data=data;
                return;
            }
            current = current.next;
        }

    }
    public void insertAt(int data,int position){
        Node node = new Node(data);
        if (head==null){
            head = node;
            tail = node;
            count++;
            return;
        }if (position==1){
            node.next=head;
            head=node;
            count++;
            return;
        }
        if (position==count){
            tail.next=node;
            tail=node;
            count++;
            return;
        }
        if (position<1 || position>count){
            System.out.println("Out of Bound Cannot add Node");

        }
    }
    public void deleteAt(int position){
        if (head == null){
            System.out.println("No ELement Delete");
            return;
        }
        if (position<1 || position>count){
            System.out.println();
            return;
        }
        if (position==count){
//            for (int i=position-1){
//
//            }
        }
    }

}
