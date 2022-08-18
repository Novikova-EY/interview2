public class LinkedList {

    private class Node {
        int data;
        Node next;
    }
    private int size;

    public int size() {
        return this.size;
    }

    public Node get(int idx) {
        Node temp = new Node();
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void add(int item, int idx) {
        Node node = new Node();
        node.data = item;
        node.next = null;
        Node prev = get(idx - 1);
        prev.next = node;
        node.next = prev.next;
        this.size++;
    }

    public void remove(int idx) {
        Node prev = get(idx - 1);
        Node del = prev.next;
        prev.next = del.next;
        this.size--;
    }
}
