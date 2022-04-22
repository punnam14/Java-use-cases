package Assignment14;

public class Stack {
    class Node{
        int data;
        Node next;
    }
    Node top;
    Stack(int data){
        this.top = null;
    }
    public void push(int data){
        Node temp = new Node();
        if(temp == null){
            System.out.println("Stack overflow");
        }
        temp.data = data;
        temp.next = top;
        top = temp;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if (!isEmpty()){
            return top.data;
        }else{
            System.out.println("Stack is empty");
        }
    }
    public void pop(int data){
        if(top == null){
            System.out.println("Stack underflow");
        }
        top = (top).next;
    }
    public void show(){
        if(top == null){
            System.out.println("Stack underflow");
        }else{
            Node temp = top;
            while(temp != null){
                System.out.println("data is: "+temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        Stack obj = new Stack();

        obj.push(56);
        obj.push(30);
        obj.push(70);

        obj.show();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.show();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}