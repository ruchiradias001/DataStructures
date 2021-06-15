// Singly LinkedList implementation using double nodes

public class SinglyLinkedListDemo {

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

    public void addLast(int item)
    {
        Node newNode = new Node(item);

        // [newNode] --> newNodeLink___newItem
        //                           |_newLink --> null

        if (isEmpty()){

            // [head] --> linkH0 --> null

            // [current] --> linkC0 --> null

            head = current = newNode;

            // linkH0 = newNodeLink

            // [head] --> H-link0___newItem
            //                    |_newLink --> null

            // linkC0 = newNodeLink

            // [current] --> C-link0___newItem
            //                       |_newLink --> null
        }
        else {
            // list has 3 item in it.

            // [head] --> H-link0___item0
            //                    |_link1___item1
            //                            |_link2___item2
            //                                    |_link3 --> null

            // [current] --> C-link0___item2
            //                       |_link3 --> null

            current.nextLink = newNode;

            // [current.nextLink] --> link3

            // link3 = newNodeLink

            // link3___newItem
            //       |_newLink --> null

            // [current] --> C-link0___item2
            //                       |_link3___newItem
            //                               |_newLink --> null

            // [head] --> H-link0___item0
            //                    |_link1___item1
            //                            |_link2___item2
            //                                    |_link3___newItem
            //                                            |_newLink --> null

            current = newNode;

            // C-link0 = newNodeLink

            // C-link0___newItem
            //         |_newLink --> null

            // [current] --> C-link0___newItem
            //                       |_newLink --> null

        }
        size++;
    }

    public void addFirst(int item)
    {
        // [newNode] --> newNodeLink___newItem
        //                           |_newLink --> null

        Node newNode = new Node(item);

        // list has 3 item in it.

        // [head] --> H-link0___item0
        //                    |_link1___item1
        //                            |_link2___item2
        //                                    |_link3 --> null

        newNode.nextLink = head;

        // newLink = H-link0

        // [newNode] --> newNodeLink___newItem
        //                           |_newLink___item0
        //                                     |_link1___item1
        //                                             |_link2___item2
        //                                                     |_link3 --> null

        head = newNode;

        // H-link0 = newNodeLink

        // [head] --> H-link0___newItem
        //                    |_newLink___item0
        //                              |_link1___item1
        //                                      |_link2___item2
        //                                              |_link3 --> null

        size++;
    }
}
