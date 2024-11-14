package removeDuplicates;

class ListNode {
    public int data;
    public ListNode next = null;

    public ListNode(int data) {
        this.data = data;
    }
}

public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front=null;
    }

    public ListNode getFront() {
        return front;
    }

    public LinkedIntList(ListNode node) {
        this.front = node;
    }

    public void add(ListNode node) {
        if (front == null) {
            front = node;
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void printList() {
        ListNode cur = front;
        System.out.print("[ ");
        while (cur.next != null) {
            System.out.print(cur.data + ", ");
            cur = cur.next;
        }
        System.out.println(cur.data + " ]");
    }

    public void removeAll(LinkedIntList list) { // можно удалить
        if (this.front != null && list.front != null) {
            ListNode prev = null;
            ListNode current = this.front;
            ListNode current2 = list.front;
            while (current != null && current2 != null) {
                if (current.data < current2.data) {
                    prev = current;
                    current = current.next;
                } else if (current.data == current2.data) {
                    if (current == front) {
                        front = current.next;
                        current = front;
                        prev = null;
                    } else {
                        prev.next = current.next;
                        current = current.next;
                    }
                } else {
                    current2 = current2.next;
                }
            }
        }
    }

    public void removeDuplicates() {
        ListNode current = front;
        while (current != null) {
            ListNode current2 = current.next;
            ListNode prev = current;
            while (current2 != null) {
                if (current.data == current2.data) {
                    prev.next = current2.next;
                    current2 = prev.next;
                } else {
                    prev = current2;
                    current2 = current2.next;
                }
            }
            current = current.next;
        }
    }

    public void firstLast() { // можно удалить
        if (front != null) {
            ListNode prev = front;
            while (prev.next.next != null) {
                prev = prev.next;
            } //prev.next == last node
            ListNode temp = prev.next; //temp == last node
            prev.next = front; // prev.next == front => last node == front
            temp.next = front.next; // => first node(front) == temp
            front.next = null;
            front = temp;
        }
    }
}

class TestRemoveDuplicates {
    public static void main(String[] args) {
        var list = new LinkedIntList();
        list.add(new ListNode(14));
        list.add(new ListNode(8));
        list.add(new ListNode(14));
        list.add(new ListNode(12));
        list.add(new ListNode(1));
        list.add(new ListNode(14));
        list.add(new ListNode(11));
        list.add(new ListNode(8));
        list.add(new ListNode(8));
        list.printList();
        list.removeDuplicates();
        list.printList();
    }
}
