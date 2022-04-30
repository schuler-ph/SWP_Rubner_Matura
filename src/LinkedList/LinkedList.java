package LinkedList;

public class LinkedList {
    public Node first;

    public LinkedList(Node frst){
        first = frst;
    }

    public Node findLast(){
        Node n = first;

        while(n.next != null){
            n = n.next;
        }

        return n;
    }

    public void append(Node n){
        this.findLast().next = n;
    }

    public int len(){
        int cnt = 0;
        Node curr = first;

        while(curr != null){
            cnt++;
            curr = curr.next;
        }

        return cnt;
    }

    public void printAll(){
        Node curr = first;

        while(curr != null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
}
