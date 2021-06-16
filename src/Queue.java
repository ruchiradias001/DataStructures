public class Queue
{
    private int[] queue = new int[5];
    private int front;
    private int rear;
    private int size;

    public void enQueue(int item)
    {
        if (isFull()){
            System.out.println("Queue is full");
        }
        else {
            queue[rear] = item;
            rear = (rear % 5) + 1;
            size++;
        }
    }

    public void deQueue()
    {
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            front = (front % 5) + 1;
            size--;
        }
    }

    public int getSize()
    {
        return size;
    }

    public boolean isFull()
    {
        return getSize()==5;
    }

    public boolean isEmpty()
    {
        return getSize()<=0;
    }

    public void show()
    {
        System.out.print("Queue -> ");
        for (int i=0; i<getSize(); i++){
            System.out.print(queue[(front+i) % 5] + " ");
        }
        System.out.println();
    }
}
