public class Linked {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Link the new node to the end of the list
        tail = newNode; // Update the tail to be the new node
    }

    public void print() {
        if (head == null) {
            System.out.print("null");
            return; // Ensure the method exits if the list is empty
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        Linked ll = new Linked();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();
    }
}
