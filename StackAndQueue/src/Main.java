import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Number> numbers = new Stack<>();
//        numbers.push(1);
//        numbers.push(2);
//        numbers.push(3);
//        numbers.push(4);
//        System.out.println(numbers.search(3));
//        System.out.println(numbers.peek()); // Lấy ra nhưng k xóa;
//        System.out.println(numbers.peek()); // Lấy ra nhưng k xóa;
        /*
        System.out.println(numbers.pop()); // Lấy ra phần tử trên cùng và xóa
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        // Phục vụ 1 trường hợp đặc biệt cần cơ chế này or trong tương tác bộ nhớ or build lib
        */

        /*
        Queue: là 1 cấu trúc dữ liệu dạng hàng dợi, hoạt động theo cơ chế FIFO

         */

//        LinkedList<Number> linkedList = new LinkedList<>(); Linked List
//        Queue<Number> queue = new LinkedList<>(); // biến queue hoặc động theo cơ chế hàng đợi
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5); // Them vao queue
//        System.out.println(queue.poll()); // poll() Lay ra va xoa luon
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
        /*
         Queue<Number> queue = new PriorityQueue<>((o1, o2) -> o2.intValue() - o1.intValue()); // biến queue hoặc động theo cơ chế hàng đợi
        queue.add(55);
        queue.add(34);
        queue.add(23);
        queue.add(4);
        queue.add(5); // Them vao queue
        System.out.println(queue.poll()); // poll() Lay ra va xoa luon
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
         */

        ArrayDeque<Number> arrayDeque = new ArrayDeque<>(); // Có the tuong tac theo 2 chieu
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(44);
        System.out.println(arrayDeque.removeLast()); // 44
//        arrayDeque.push();
//        arrayDeque.pop();
    }
}