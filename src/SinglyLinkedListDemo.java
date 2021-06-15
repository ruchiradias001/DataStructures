// Singly LinkedList implementation using single a node

public class SinglyLinkedListDemo {

    // best practice -> define the Node class inside LinkedList class as private
    private class Node {
        private int item;
        private Node nextLink;

        public Node(int value)
        {
            this.item = value;
        }
    }

    private Node head;
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
            head = newNode;

            // [head] --> link0 --> null

            // link0 = newNodeLink

            // [head] --> link0___newItem
            //                  |_newLink --> null

        }
        else {
            // list has 2 items in it.

            // [head] --> link0___item0
            //                  |_link1___item1
            //                          |_link2 --> null

            Node node = head;

            // [node] --> link0___item0
            //                  |_link1___item1
            //                          |_link2 --> null

            for (int i=0; i<size-1; i++){
            // while (node.nextLink != null){
                node = node.nextLink;

                // node.nextLink != null --> node = link1
            }
            // [node] --> link1___item1
            //                  |_link2 --> null

            node.nextLink = newNode;

            // [newNode] --> newNodeLink___newItem
            //                           |_newLink --> null

            // [node.next] --> link2

            // link2 = newNodeLink

            // link2___newItem
            //       |_newLink --> null

            // [head] --> link0___item0
            //                  |_link1___item1
            //                          |_link2___newItem
            //                                  |_newLink --> null
        }
        size++;
    }

    public void addFirst(int item)
    {
        // list has 2 items in it.

        // [head] --> link0___item0
        //                  |_link1___item1
        //                          |_link2 --> null

        Node newNode = new Node(item);

        // [newNode] --> newNodeLink___newItem
        //                           |_newLink --> null

        newNode.nextLink = head;

        // newLink = link0

        // newLink___item0
        //         |_link1___item1
        //                 |_link2 --> null

        // [newNode] --> newNodeLink___newItem
        //                           |_newLink___item0
        //                                     |_link1___item1
        //                                             |_link2 --> null

        head = newNode;

        // link0 = newNodeLink

        // [head] --> link0___newItem
        //                  |_newLink___item0
        //                            |_link1___item1
        //                                     |_link2 --> null

        size++;
    }

    public void removeLast()
    {
        Node nullNode = null;

        // [nullNode] --> nullLink0 --> null
        if (isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            // list has 4 items in it

            // [head] --> link0___item0
            //                  |_link1___item1
            //                          |_link2___item2
            //                                  |_link3___item3
            //                                           |_link4 --> null

            Node node = head;

            // [node] --> link0___item0
            //                  |_link1___item1
            //                          |_link2___item2
            //                                  |_link3___item3
            //                                           |_link4 --> null

            // last index --> (size-1)
            // 0 < i < (index-1) --> 0 < i < (size-2)
            for (int i = 0; i < size - 2; i++) {
                node = node.nextLink;

                // if size is 4 --> i<(4-2) --> i<2
                // i=0 -> node = link1
                // i=1 -> node = link2
            }

            // [node] --> link2___item2
            //                  |_link3___item3
            //                           |_link4 --> null

            nullNode = node.nextLink;
            // [nullNode] --> nullLink0 --> null

            // [node.nextLink] --> link3

            // nullLink0 = link3

            // nullLink0___item3
            //           |_link4 --> null

            node.nextLink = nullNode.nextLink;
            // [node.nextLink] --> link3

            // [nullNode] --> nullLink0___item3
            //                          |_link4 --> null

            // [nullNode.nextLink] --> link4

            // link3 = link4

            // link3 --> null

            // [head] --> link0___item0
            //                  |_link1___item1
            //                          |_link2___item2
            //                                  |_link3 --> null

            size--;
        }
    }

    public void removeFirst()
    {
        // [head] --> link0___item0
        //                  |_link1___item1
        //                           |_link2___item2
        //                                   |_link3___item3
        //                                           |_link4 --> null

        head = head.nextLink;

        // link0 = link1

        // link0___item1
        //       |_link2___item2
        //                |_link3___item3
        //                        |_link4 --> null


        // [head] --> link0___item1
        //                  |_link2___item2
        //                          |_link3___item3
        //                                  |_link4 --> null

        size--;
    }
}
