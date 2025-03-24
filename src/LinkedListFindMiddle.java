public class LinkedListFindMiddle {

    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListFindMiddle(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length ++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
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
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    // WRITE FIND MIDDLE NODE METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////
    public  Node getMiddleNode(){
        Node head = getHead();
        Node result = null;
        if(head != null)
        {
           //int length = length;
           int index = (int) Math.ceil((float)length / 2);
            System.out.println("index:"+index);
           Node node = getHead();
           result = node;
           for(int i =0 ; i< index-1;i++){
               result = result.next;
               System.out.println("i index--"+i + " Node value:"+result.value);
           }
        }
        return result;
    }
    public static void main(String[] args) {
        LinkedListFindMiddle linkedListFindMiddle = new LinkedListFindMiddle(1);
        linkedListFindMiddle.append(2);
        linkedListFindMiddle.append(3);
        linkedListFindMiddle.append(4);
        linkedListFindMiddle.append(5);
        linkedListFindMiddle.printAll();
        System.out.println(linkedListFindMiddle.length);


        Node node = linkedListFindMiddle.getMiddleNode();
        System.out.println("**************"+node.value);

    }

}

