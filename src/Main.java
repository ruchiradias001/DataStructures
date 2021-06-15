public class Main
{
    public static void main(String args[])
    {
        SinglyLinkedList list = new SinglyLinkedList();
        // 01
        list.addLast(1);
        list.addLast(2);
        list.displayItems();
        System.out.println();

        // 02
        list.addFirst(5);
        list.addFirst(6);
        list.displayItems();
        System.out.println();

        //03
        list.removeLast();
        list.displayItems();
        System.out.println();

        //04
        list.removeFirst();
        list.displayItems();
        System.out.println();

        //05
        list.addLast(1);
        list.addLast(2);
        list.displayItems();
        list.addToIndex(2,9);
        list.displayItems();
        System.out.println();

        //06
        list.removeFromIndex(2);
        list.displayItems();
        System.out.println();

        //07
        list.displayItems();
        System.out.println(list.indexOf(2));
        System.out.println(list.indexOf(8));
        System.out.println();

    }
}
