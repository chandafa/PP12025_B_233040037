package Pertemuan1;

// Kelas NodeMain untuk menguji implementasi Node
public class NodeMain {
    public static void main(String[] args) {
        // Membuat node pertama
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(9);
        Node node4 = new Node(8);

        // Menghubungkan node satu sama lain (urutan: 5 → 7 → 9 → 8)
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        // Menampilkan isi list
        Node pointer = node1; // Pointer untuk iterasi
        while (pointer != null) {
            System.out.print(pointer.getNilai() + " ");
            pointer = pointer.getNext();
        }
    }
}
