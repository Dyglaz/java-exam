package Bilet_25_stackOnList;

public class StackOnList<T> {

    public class ListNode {
        public T data;
        public ListNode next;

        public ListNode(T data, ListNode node) {
            this.data = data;
            this.next = node;
        }
    }

    private ListNode pointer;
    private int size;

    public StackOnList() {
        this.pointer = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T a) {
        pointer = new ListNode(a, pointer);
        size++;
    }

    public T pop() {
        T temp = pointer.data;
        pointer = pointer.next;
        size--;
        return temp;
    }

    public T peek() {
        return pointer.data;
    }

    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + ", ");
        }
    }
}
