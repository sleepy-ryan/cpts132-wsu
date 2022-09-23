package cpts132.data_structures;

public class ListNode {
    protected Object value;
    protected ListNode nextNodeRef;
    public ListNode() {
        nextNodeRef = null;
        value = 0;
    }
    public ListNode(Object d, ListNode n) {
        value = d;
        nextNodeRef = n;
    }
    public void setNextNodeRef(ListNode n) {
        nextNodeRef = n;
    }
    public void setValue(Object d) {
        value = d;
    }
    public ListNode getNextNodeRef() {
        return nextNodeRef;
    }
    public Object getValue() {
        return value;
    }
}