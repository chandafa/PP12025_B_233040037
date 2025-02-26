package Pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        System.out.println("Hasil : ");

        StrukturList list = new StrukturList();
        list.addHead(1.5);
        list.addTail(3.7);
        list.addMid(2.6, 1);
        list.addMid(4.9, 3);
        System.out.print("List : ");
        list.displayList();

        StrukturList listA = new StrukturList();
        listA.addHead(3.4);
        listA.addTail(4.5);
        listA.addMid(2.1, 0);
        System.out.print("List a: ");
        listA.displayList();

        StrukturList listB = new StrukturList();
        listB.addHead(4.5);
        listB.addHead(2.1);
        listB.addHead(3.4);
        listB.addMid(1.1, 2);
        listB.addTail(5.5);
        System.out.print("List b: ");
        listB.displayList();
    }
}
