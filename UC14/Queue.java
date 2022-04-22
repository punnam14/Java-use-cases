package Assignment14;

public class Queue {
    Node front;
    Node rear;
    public class Node{
        int key;
        Node next;
        public Node(int key){
            this. key = key;
            this.next = null;
        }
    }
    public void doQueue(){
        this.front = this.rear = null;
    }
    public void doEnqueue(int key){
        Node temp = new Node(key);
        if(this.rear == null){
            this.front = this.rear = temp;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    public void doDequeue(){
        if(this.front == null ){
            return;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.doEnqueue(56);
        q.doEnqueue(30);
        q.doEnqueue(70);
        q.doDequeue();
        q.doDequeue();

        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}