package adv;

public class Node<T> {
    int value;
    Node next;

    public Node(T value, Node next) {
        this.value = (int) value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = (int) value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public Node() {
    }
}
