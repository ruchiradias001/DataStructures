// Singly LinkedList implementation using double nodes

public class SinglyLinkedList {

    // best practice -> define Node class inside LinkedList class as private
    private class Node {
        private int item;
        private Node nextLink;

        public Node(int value)
        {
            this.item = value;
        }
    }

    private Node head;
    private Node current;
    private int size;

    public boolean isEmpty()
    {
        if (size == 0){
            return true;
        }
        return false;
    }

    public void addFirst(int item)
    {
        Node newNode = new Node(item);
        newNode.nextLink = head;
        head = newNode;
        size++;
    }

    public void addLast(int item)
    {
        Node newNode = new Node(item);

        if (isEmpty()){
            head = current = newNode;
        }
        else {
            current.nextLink = newNode;
            current = newNode;
        }
        size++;
    }

    public void addToIndex(int index, int item)
    {
        Node newNode = new Node(item);
        if (isEmpty()){
            System.out.println("List is empty");
        }
        else if (index < 0 || index >= size){
            System.out.println("Invalid index");
        }
        else {
            Node node = head;
            for (int i=0; i<index-1; i++){
                node = node.nextLink;
                // if index = 4, i<3 --> i=2, link0 = link3
            }
            newNode.nextLink = node.nextLink;
            node.nextLink = newNode;
            size++;
        }
    }

    public void removeFirst()
    {
        Node node = head.nextLink;
        head = node;
        size--;
    }

    public void removeLast()
    {
        if (isEmpty()){
            System.out.println("List is empty");
        }
        else {
            Node node = head;
            for (int i=0; i<size-2; i++){
                node = node.nextLink;
                // if size = 4, i<2 --> i=1, H-link0 = link2
            }
            node.nextLink = null;
            current = node;
        }
        size--;
    }

    public void removeFromIndex(int index)
    {
        if (isEmpty()){
            System.out.println("List is empty");
        }
        else if (index < 0 || index >= size){
            System.out.println("Invalid index");
        }
        else {
            if (index == size -1){
                removeLast();
            }
            else {
                Node node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.nextLink;
                    // if index = 4, i<3 --> i=2, link0 = link3
                }
                Node nullNode = node.nextLink;
                node.nextLink = nullNode.nextLink;
                size--;
            }
        }
    }

    public int indexOf(int item)
    {
        int index = -1;

        if (isEmpty()){
            System.out.println("List is empty");
        }
        else {
            Node node = head;
            for (int i=0; i<size; i++){
                if (item == node.item){
                    index = i;
                }
                node = node.nextLink;
                // if size = 4, i<4 --> i<3, link0 = link4 = null
            }
        }
        return index;
    }

    public void displayItems()
    {
        Node node = head;
        System.out.print("Items --> ");
        for (int i=0; i<size; i++){
            // while (node.nextLink != null){
            System.out.print(node.item + " ");
            node = node.nextLink;
            // if size = 4, i<4 --> i=3, link0 = link4 = null
        }
        System.out.println();
    }
}
