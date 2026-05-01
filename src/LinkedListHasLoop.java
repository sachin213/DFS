public class LinkedListHasLoop {

    private Node head;
    private Node tail;
    private int length;
    private LinkedListHasLoop next ;

    public LinkedListHasLoop() {
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListHasLoop(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE HASLOOP METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public boolean hasLoop(){
        Node slowPointer = head;
        if(head == null) return false;
        Node fastPointer = head.next !=null ? head.next.next : null;

        while (fastPointer != null && fastPointer.next != null){
            if(slowPointer == fastPointer){
                System.out.println("recursive node :"+slowPointer.value);
                return true;
            }
            else{
                slowPointer = slowPointer.next ;
                fastPointer = fastPointer.next.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListHasLoop node1 = new LinkedListHasLoop(10);
        node1.append(2);
        node1.append(3);
        node1.append(4);
        node1.append(10);
        System.out.println(new LinkedListHasLoop().hasLoop());

    }
}

