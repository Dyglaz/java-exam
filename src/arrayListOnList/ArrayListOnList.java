package arrayListOnList;

public class ArrayListOnList<T> {
    public class ListNode {
        public T data;
        public ListNode next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode front;
    private int size;

    public ArrayListOnList() {
        front = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T a) {
        if (isEmpty()) {
            front = new ListNode(a);
        } else {
            ListNode temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(a);
        }
        size++;
    }

    public boolean add(int i, T a) {
        if (i < size && i >= 0 && !isEmpty()) {
            int index = 0;
            ListNode temp = front;
            while (index != i) {
                temp = temp.next;
                index++;
            }
            temp.data = a;
            return true;
        } else if (i == 0 && size == 0) {
            add(a);
            return true;
        } else
            return false;
    }

    public T get(int index) {
        int i = 0;
        ListNode temp = front;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        ArrayListOnList<Integer> array = new ArrayListOnList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.println();
        System.out.println(array.get(2));
        array.add(2, 6);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }
    }
}
