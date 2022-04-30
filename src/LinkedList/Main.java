package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new Node(6, new Node(1, new Node(2, null))));

        ll.printAll();

        ll.append(new Node(5, null));

        ll.printAll();

    }
}
