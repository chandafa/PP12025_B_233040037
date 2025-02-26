package Pertemuan4;

class StrukturList {
    private Node head;

    public StrukturList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Tambah di awal
    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Tambah di akhir
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // Tambah di tengah berdasarkan index
    public void addMid(double data, int position) {
        if (position == 0) {
            addHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Index di luar batas.");
            return;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
