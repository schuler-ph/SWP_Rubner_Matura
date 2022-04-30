package LinkedList;

public class DNode {
    public int value;
    public DNode next = null;
    public DNode prev = null;

    public DNode(int val, DNode nxt, DNode prv){
        value = val;
        next = nxt;
        prev = prv;
    }
}
