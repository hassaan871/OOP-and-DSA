public class SinglyLinkedList{
    private Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    /**
     * Insert Node at the Begining of the SinglyLinkedlist
     * 
     * @param value data in the node
     */
    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Insert Node at the End of the SinglyLinkedlist
     * 
     * @param value data in the node
     */
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * Display the values in SinglyLinkedList
     */
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}