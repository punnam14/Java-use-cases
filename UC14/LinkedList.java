package Assignment14;

public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insertBeginning(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        }
    public void insertAfter(Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("Previous node cannot be null, try again");
        }else{
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }
    }
    public void insertEnd(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void deleteNode(int position){
        if(head == null)
            return;
        Node temp = head;
        if(position == 0)
            head = temp.next;
        for(int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if(temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    public boolean search(Node head, int key){
        Node current = head;
        while(current != null){
            if(current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }
    public void sort(Node head){
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public void display(){
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertBeginning(70);
        llist.insertBeginning(30);
        llist.insertBeginning(56);
        llist.insertEnd(25);
        llist.insertAfter(llist.head.next, 20);

        System.out.println("Linked list: ");
        llist.display();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.display();

        System.out.println();
        int item_to_find = 30;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sort(llist.head);
        System.out.println("\nSorted List: ");
        llist.display();
    }
    }