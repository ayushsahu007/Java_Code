package Queue.queue_using_linkedList;

public class Queue {
    Node front;
    Node rear;
    int count;

    public void enque(int data){
        Node node = new Node(data);
        if (this.rear == null){
            front = rear = node;
            count++;
        }else {
            rear.next = node;
            rear = rear.next;
            count++;
        }
    }
    public int peek(){
        if (front== null){
            throw new RuntimeException("Queue is Empty");
        }else {
            return front.data;
        }
    }

    public boolean isEmpty(){
        return front== null && rear == null ? true : false;
    }

    public void display(){
        if (front==null){
            throw new RuntimeException("Queue is Empty");
        }else {
            Node temp = front;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public int deque(){
        if (front==null){
            throw new RuntimeException("Queue is Empty");
        }else {
            if (front==rear){
                Node temp = front;
                front = front.next;
                rear = rear.next;
                int value = temp.data;
             //   temp.next=null;
                count--;
                return value;
            }
            Node temp = front;
            front = front.next;
            int value = temp.data;
            temp.next=null;
            count--;
            return value;
        }
    }
}
