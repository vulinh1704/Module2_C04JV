public class Node<E> {
    E e;
    Node<E> next;

    public Node(E e) {
        this.e = e;
        this.next = null;
    }
}

class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E e) {
        Node<E> node = new Node<>(e);
        if(this.size == 0) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else {
            this.tail.next = node;
            this.tail = node;
            this.tail.next = null;
            this.size++;
        }
    }

    public void removeLast() {
        Node<E> currentNode = this.head;
        while (currentNode.next != this.tail) {
            currentNode = currentNode.next;
        }
        this.tail = currentNode;
        this.tail.next = null;
    }

    public void showLinkedList() {
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.println("Element: " + currentNode.e);
            currentNode = currentNode.next;
        }
    }

}

class Main2 {
    public static void main(String[] args) {
        LinkedList<Number> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(99);
        list.add(-100);
        System.out.println("LinkedList truoc xoa: ");
        list.showLinkedList();
        System.out.println("LinkedList sau xoa: ");
        list.removeLast();
        list.showLinkedList();
    }
}
