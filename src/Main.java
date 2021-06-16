public class Main
{
    public static void main(String args[])
    {
        Queue obj = new Queue();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.show();
        obj.enQueue(6);
        System.out.println();

        obj.deQueue();
        obj.show();
        System.out.println();

        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.show();
        obj.deQueue();
    }
}
