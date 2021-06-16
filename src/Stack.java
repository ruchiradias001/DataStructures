public class Stack
{
    private int[] stack = new int[5];
    private int top = 0;

    public void push(int item)
    {
        if (isFull()){
            System.out.println("stack is full");
        }
        else {
            stack[top] = item;
            top++;
        }
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
        }
        return item;
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
