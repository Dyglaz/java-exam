package Bilet_12;

class ListNode {
    public int data;
    public ListNode next = null;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedIntList {
    private ListNode head;

    public LinkedIntList() {
        head = null;
    }

    public ListNode getHead() {
        return head;
    }

    public LinkedIntList(ListNode node) {
        this.head = node;
    }

    public void add(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void add(int data) {
        add(new ListNode(data));
    }

    public void printList() {
        ListNode cur = head;
        System.out.print("[ ");
        while (cur.next != null) {
            System.out.print(cur.data + ", ");
            cur = cur.next;
        }
        System.out.println(cur.data + " ]");
    }

    public void insert(int index, int data) {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        }else{
            int i = 0;
            ListNode current = head;
            while (current.next != null && i+1 != index) {
                current = current.next;
                i++;
            }
            if (i+1 == index) {
                current.next = new ListNode(data, current.next);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

    }
}

class Tester {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.printList();
        list.insert(0,3);
        list.printList();
    }
}
