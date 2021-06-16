public class Main
{
    public static void main(String args[])
    {
        DynamicStack obj = new DynamicStack();
        obj.push(9);
        obj.push(9);
        obj.displayStack();
        obj.push(9);
        obj.displayStack();
        System.out.println();

        obj.push(9);
        obj.displayStack();
        obj.push(9);
        obj.displayStack();
        System.out.println();

        obj.pop();
        obj.pop();
        obj.displayStack();
        obj.pop();
        obj.displayStack();
        System.out.println();

        obj.pop();
        obj.displayStack();
        obj.pop();
        obj.displayStack();
        System.out.println();

        obj.push(9);
        obj.push(9);
        obj.displayStack();
        obj.push(9);
        obj.displayStack();
        System.out.println();
        
        obj.push(9);
        obj.displayStack();
        obj.push(9);
        obj.displayStack();


    }
}
