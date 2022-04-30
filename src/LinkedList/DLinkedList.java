package LinkedList;

public class DLinkedList {
    public DNode first;

    public DLinkedList(){}

    public DNode findLast(){
        if(first == null) return first;
        DNode n = first;

        while(n.next != null){
            n = n.next;
        }

        return n;
    }

    public void append(DNode n){
        if (findLast() == null){ first = n; return; }
        n.prev = findLast();
        findLast().next = n;
    }

    public int len(){
        int cnt = 0;
        DNode curr = first;

        while(curr != null){
            cnt++;
            curr = curr.next;
        }

        return cnt;
    }

    public void printAll(){
        DNode curr = first;

        while(curr != null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
}
