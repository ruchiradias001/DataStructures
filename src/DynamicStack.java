public class DynamicStack
{
    private int capacity = 2;
    private int[] stack = new int[capacity];
    private int top = 0;

    public void push(int item)
    {
        if (isFull()){
            expand();
        }
        stack[top] = item;
        top++;
    }

    public void expand()
    {
        capacity*=2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
    }

    public int pop()
    {
        int item = 0;
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        else {
            top--;
            item = stack[top];
            stack[top] = 0;
            shrink();
        }
        return item;
    }

    public void shrink()
    {
        if (size() <= capacity/4){
            capacity/=2;
            int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, size());
            stack = newStack;
        }
    }

    public int peek()
    {
        return stack[top-1];
    }

    public int size()
    {
        return top;
    }

    private boolean isFull()
    {
        return top==stack.length;
    }

    public boolean isEmpty()
    {
        return top<=0;
    }

    public void displayStack()
    {
        System.out.print("Stack -> ");
        for (int item : stack){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
