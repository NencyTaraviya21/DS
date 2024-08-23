

 public class ReverseLL {

    // Node blueprint
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linkend list is empty .!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseLL li = new ReverseLL();
        li.addLast(1);
        li.addLast(2);
        li.addLast(3);
        li.addLast(4);
        li.addLast(5);

        System.out.println("LL: ");
        li.printList();

        li.reverse();

        System.out.println("Reverse LL : ");
        li.printList();
    }
}